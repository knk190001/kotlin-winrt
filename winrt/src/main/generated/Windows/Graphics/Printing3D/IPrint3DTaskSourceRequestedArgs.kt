package Windows.Graphics.Printing3D

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPrint3DTaskSourceRequestedArgs.ABI::class)
@Signature("{c77c9aba-24af-424d-a3bf-92250c355602}")
@Guid("c77c9aba24af424da3bf92250c355602")
@WinRTInterface("c77c9aba24af424da3bf92250c355602")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrint3DTaskSourceRequestedArgs.ByReference::class)
public interface IPrint3DTaskSourceRequestedArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetSource(source: Printing3D3MFPackage?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrint3DTaskSourceRequestedArgs> {
    public override fun getValue() = ABI.makeIPrint3DTaskSourceRequestedArgs(pointer.getPointer(0))

    public fun setValue(value: IPrint3DTaskSourceRequestedArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrint3DTaskSourceRequestedArgs {
    public val __1943770104_Ptr: Pointer?

    public val _1943770104_VtblPtr: Pointer?
      get() = __1943770104_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetSource(source: Printing3D3MFPackage?): Unit {
      val fnPtr = _1943770104_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1943770104_Ptr, marshalToNative(source),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPrint3DTaskSourceRequestedArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1943770104_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrint3DTaskSourceRequestedArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c77c9aba24af424da3bf92250c355602")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrint3DTaskSourceRequestedArgs(ptr: Pointer?): WithDefault =
        IPrint3DTaskSourceRequestedArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrint3DTaskSourceRequestedArgs {
      val address = segment.toRawLongValue()
      return makeIPrint3DTaskSourceRequestedArgs(Pointer(address))
    }

    public override fun toNative(obj: IPrint3DTaskSourceRequestedArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1943770104_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrint3DTaskSourceRequestedArgs):
        Array<IPrint3DTaskSourceRequestedArgs?> = (elements as
        Array<IPrint3DTaskSourceRequestedArgs?>).castToImpl<IPrint3DTaskSourceRequestedArgs,IPrint3DTaskSourceRequestedArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrint3DTaskSourceRequestedArgs?> =
        arrayOfNulls<IPrint3DTaskSourceRequestedArgs_Impl>(size) as
        Array<IPrint3DTaskSourceRequestedArgs?>
  }
}

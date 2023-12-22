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

@ABIMarker(IPrint3DTaskSourceChangedEventArgs.ABI::class)
@Signature("{5bcd34af-24e9-4c10-8d07-14c346ba3fcf}")
@Guid("5bcd34af24e94c108d0714c346ba3fcf")
@WinRTInterface("5bcd34af24e94c108d0714c346ba3fcf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrint3DTaskSourceChangedEventArgs.ByReference::class)
public interface IPrint3DTaskSourceChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Source(): Printing3D3MFPackage?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrint3DTaskSourceChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIPrint3DTaskSourceChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPrint3DTaskSourceChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrint3DTaskSourceChangedEventArgs {
    public val __2049074026_Ptr: Pointer?

    public val _2049074026_VtblPtr: Pointer?
      get() = __2049074026_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Source(): Printing3D3MFPackage? {
      val fnPtr = _2049074026_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Printing3D3MFPackage>()
      val hr = fn.invokeHR(arrayOf(__2049074026_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Printing3D3MFPackage>(result.getValue())
      return resultValue
    }
  }

  public class IPrint3DTaskSourceChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2049074026_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrint3DTaskSourceChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5bcd34af24e94c108d0714c346ba3fcf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrint3DTaskSourceChangedEventArgs(ptr: Pointer?): WithDefault =
        IPrint3DTaskSourceChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrint3DTaskSourceChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPrint3DTaskSourceChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPrint3DTaskSourceChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2049074026_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrint3DTaskSourceChangedEventArgs):
        Array<IPrint3DTaskSourceChangedEventArgs?> = (elements as
        Array<IPrint3DTaskSourceChangedEventArgs?>).castToImpl<IPrint3DTaskSourceChangedEventArgs,IPrint3DTaskSourceChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrint3DTaskSourceChangedEventArgs?> =
        arrayOfNulls<IPrint3DTaskSourceChangedEventArgs_Impl>(size) as
        Array<IPrint3DTaskSourceChangedEventArgs?>
  }
}

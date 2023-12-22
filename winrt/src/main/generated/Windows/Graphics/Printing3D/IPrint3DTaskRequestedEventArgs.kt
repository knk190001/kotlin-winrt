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

@ABIMarker(IPrint3DTaskRequestedEventArgs.ABI::class)
@Signature("{150cb77f-18c5-40d7-9f40-fab3096e05a9}")
@Guid("150cb77f18c540d79f40fab3096e05a9")
@WinRTInterface("150cb77f18c540d79f40fab3096e05a9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrint3DTaskRequestedEventArgs.ByReference::class)
public interface IPrint3DTaskRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): Print3DTaskRequest?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrint3DTaskRequestedEventArgs> {
    public override fun getValue() = ABI.makeIPrint3DTaskRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPrint3DTaskRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrint3DTaskRequestedEventArgs {
    public val __1975922975_Ptr: Pointer?

    public val _1975922975_VtblPtr: Pointer?
      get() = __1975922975_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): Print3DTaskRequest? {
      val fnPtr = _1975922975_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Print3DTaskRequest>()
      val hr = fn.invokeHR(arrayOf(__1975922975_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Print3DTaskRequest>(result.getValue())
      return resultValue
    }
  }

  public class IPrint3DTaskRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1975922975_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrint3DTaskRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("150cb77f18c540d79f40fab3096e05a9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrint3DTaskRequestedEventArgs(ptr: Pointer?): WithDefault =
        IPrint3DTaskRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrint3DTaskRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPrint3DTaskRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPrint3DTaskRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1975922975_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrint3DTaskRequestedEventArgs):
        Array<IPrint3DTaskRequestedEventArgs?> = (elements as
        Array<IPrint3DTaskRequestedEventArgs?>).castToImpl<IPrint3DTaskRequestedEventArgs,IPrint3DTaskRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrint3DTaskRequestedEventArgs?> =
        arrayOfNulls<IPrint3DTaskRequestedEventArgs_Impl>(size) as
        Array<IPrint3DTaskRequestedEventArgs?>
  }
}

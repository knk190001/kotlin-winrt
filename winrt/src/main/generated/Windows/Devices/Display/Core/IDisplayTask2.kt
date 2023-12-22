package Windows.Devices.Display.Core

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

@ABIMarker(IDisplayTask2.ABI::class)
@Signature("{0957ea19-bd55-55de-9267-c97b61e71c37}")
@Guid("0957ea19bd5555de9267c97b61e71c37")
@WinRTInterface("0957ea19bd5555de9267c97b61e71c37")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayTask2.ByReference::class)
public interface IDisplayTask2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetSignal(signalKind: DisplayTaskSignalKind?, fence: DisplayFence?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDisplayTask2>
      {
    public override fun getValue() = ABI.makeIDisplayTask2(pointer.getPointer(0))

    public fun setValue(value: IDisplayTask2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayTask2 {
    public val __2038705107_Ptr: Pointer?

    public val _2038705107_VtblPtr: Pointer?
      get() = __2038705107_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetSignal(signalKind: DisplayTaskSignalKind?, fence: DisplayFence?): Unit {
      val fnPtr = _2038705107_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2038705107_Ptr, marshalToNative(signalKind),
          marshalToNative(fence),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDisplayTask2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2038705107_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayTask2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0957ea19bd5555de9267c97b61e71c37")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayTask2(ptr: Pointer?): WithDefault = IDisplayTask2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayTask2 {
      val address = segment.toRawLongValue()
      return makeIDisplayTask2(Pointer(address))
    }

    public override fun toNative(obj: IDisplayTask2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2038705107_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayTask2): Array<IDisplayTask2?> = (elements as
        Array<IDisplayTask2?>).castToImpl<IDisplayTask2,IDisplayTask2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayTask2?> =
        arrayOfNulls<IDisplayTask2_Impl>(size) as Array<IDisplayTask2?>
  }
}

package Windows.Devices.AllJoyn

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

@ABIMarker(IAllJoynBusAttachmentStateChangedEventArgs.ABI::class)
@Signature("{d82e75f4-c02a-41ec-a8d5-eab1558953aa}")
@Guid("d82e75f4c02a41eca8d5eab1558953aa")
@WinRTInterface("d82e75f4c02a41eca8d5eab1558953aa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAllJoynBusAttachmentStateChangedEventArgs.ByReference::class)
public interface IAllJoynBusAttachmentStateChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_State(): AllJoynBusAttachmentState?

  @InterfaceMethod(1)
  public fun get_Status(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAllJoynBusAttachmentStateChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIAllJoynBusAttachmentStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAllJoynBusAttachmentStateChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAllJoynBusAttachmentStateChangedEventArgs {
    public val __165034974_Ptr: Pointer?

    public val _165034974_VtblPtr: Pointer?
      get() = __165034974_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_State(): AllJoynBusAttachmentState? {
      val fnPtr = _165034974_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AllJoynBusAttachmentState>()
      val hr = fn.invokeHR(arrayOf(__165034974_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AllJoynBusAttachmentState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Status(): Int {
      val fnPtr = _165034974_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__165034974_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IAllJoynBusAttachmentStateChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __165034974_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAllJoynBusAttachmentStateChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d82e75f4c02a41eca8d5eab1558953aa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAllJoynBusAttachmentStateChangedEventArgs(ptr: Pointer?): WithDefault =
        IAllJoynBusAttachmentStateChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAllJoynBusAttachmentStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAllJoynBusAttachmentStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAllJoynBusAttachmentStateChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__165034974_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAllJoynBusAttachmentStateChangedEventArgs):
        Array<IAllJoynBusAttachmentStateChangedEventArgs?> = (elements as
        Array<IAllJoynBusAttachmentStateChangedEventArgs?>).castToImpl<IAllJoynBusAttachmentStateChangedEventArgs,IAllJoynBusAttachmentStateChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAllJoynBusAttachmentStateChangedEventArgs?> =
        arrayOfNulls<IAllJoynBusAttachmentStateChangedEventArgs_Impl>(size) as
        Array<IAllJoynBusAttachmentStateChangedEventArgs?>
  }
}

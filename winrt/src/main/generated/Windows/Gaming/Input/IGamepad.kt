package Windows.Gaming.Input

import Windows.Gaming.Input.IGameController.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IGamepad.ABI::class)
@Signature("{bc7bb43c-0a69-3903-9e9d-a50f86a45de5}")
@Guid("bc7bb43c0a6939039e9da50f86a45de5")
@WinRTInterface("bc7bb43c0a6939039e9da50f86a45de5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGamepad.ByReference::class)
public interface IGamepad : NativeMapped, IWinRTInterface, IGameController {
  @InterfaceMethod(0)
  public fun get_Vibration(): GamepadVibration?

  @InterfaceMethod(1)
  public fun put_Vibration(value: GamepadVibration?): Unit

  @InterfaceMethod(2)
  public fun GetCurrentReading(): GamepadReading?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IGamepad> {
    public override fun getValue() = ABI.makeIGamepad(pointer.getPointer(0))

    public fun setValue(value: IGamepad_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGamepad, IGameController.WithDefault {
    public val __418806734_Ptr: Pointer?

    public val _418806734_VtblPtr: Pointer?
      get() = __418806734_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Vibration(): GamepadVibration? {
      val fnPtr = _418806734_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GamepadVibration>()
      val hr = fn.invokeHR(arrayOf(__418806734_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GamepadVibration>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Vibration(value: GamepadVibration?): Unit {
      val fnPtr = _418806734_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__418806734_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun GetCurrentReading(): GamepadReading? {
      val fnPtr = _418806734_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GamepadReading>()
      val hr = fn.invokeHR(arrayOf(__418806734_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GamepadReading>(result.getValue())
      return resultValue
    }
  }

  public class IGamepad_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IGameController {
    public override val __925471711_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_418806734_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __418806734_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGamepad, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bc7bb43c0a6939039e9da50f86a45de5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGamepad(ptr: Pointer?): WithDefault = IGamepad_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGamepad {
      val address = segment.toRawLongValue()
      return makeIGamepad(Pointer(address))
    }

    public override fun toNative(obj: IGamepad): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__418806734_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGamepad): Array<IGamepad?> = (elements as
        Array<IGamepad?>).castToImpl<IGamepad,IGamepad_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGamepad?> = arrayOfNulls<IGamepad_Impl>(size) as
        Array<IGamepad?>
  }
}

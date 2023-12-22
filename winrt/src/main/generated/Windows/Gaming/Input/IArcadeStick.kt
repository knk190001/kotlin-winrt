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

@ABIMarker(IArcadeStick.ABI::class)
@Signature("{b14a539d-befb-4c81-8051-15ecf3b13036}")
@Guid("b14a539dbefb4c81805115ecf3b13036")
@WinRTInterface("b14a539dbefb4c81805115ecf3b13036")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IArcadeStick.ByReference::class)
public interface IArcadeStick : NativeMapped, IWinRTInterface, IGameController {
  @InterfaceMethod(0)
  public fun GetButtonLabel(button: ArcadeStickButtons?): GameControllerButtonLabel?

  @InterfaceMethod(1)
  public fun GetCurrentReading(): ArcadeStickReading?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IArcadeStick> {
    public override fun getValue() = ABI.makeIArcadeStick(pointer.getPointer(0))

    public fun setValue(value: IArcadeStick_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IArcadeStick, IGameController.WithDefault {
    public val __1530563405_Ptr: Pointer?

    public val _1530563405_VtblPtr: Pointer?
      get() = __1530563405_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetButtonLabel(button: ArcadeStickButtons?): GameControllerButtonLabel? {
      val fnPtr = _1530563405_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GameControllerButtonLabel>()
      val hr = fn.invokeHR(arrayOf(__1530563405_Ptr, marshalToNative(button), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GameControllerButtonLabel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetCurrentReading(): ArcadeStickReading? {
      val fnPtr = _1530563405_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ArcadeStickReading>()
      val hr = fn.invokeHR(arrayOf(__1530563405_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ArcadeStickReading>(result.getValue())
      return resultValue
    }
  }

  public class IArcadeStick_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IGameController {
    public override val __925471711_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1530563405_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1530563405_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IArcadeStick, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b14a539dbefb4c81805115ecf3b13036")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIArcadeStick(ptr: Pointer?): WithDefault = IArcadeStick_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IArcadeStick {
      val address = segment.toRawLongValue()
      return makeIArcadeStick(Pointer(address))
    }

    public override fun toNative(obj: IArcadeStick): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1530563405_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IArcadeStick): Array<IArcadeStick?> = (elements as
        Array<IArcadeStick?>).castToImpl<IArcadeStick,IArcadeStick_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IArcadeStick?> =
        arrayOfNulls<IArcadeStick_Impl>(size) as Array<IArcadeStick?>
  }
}

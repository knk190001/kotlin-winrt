package Windows.Gaming.Input

import Windows.Gaming.Input.IGamepad.ABI.IID
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

@ABIMarker(IGamepad2.ABI::class)
@Signature("{3c1689bd-5915-4245-b0c0-c89fae0308ff}")
@Guid("3c1689bd59154245b0c0c89fae0308ff")
@WinRTInterface("3c1689bd59154245b0c0c89fae0308ff")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGamepad2.ByReference::class)
public interface IGamepad2 : NativeMapped, IWinRTInterface, IGamepad, IGameController {
  @InterfaceMethod(0)
  public fun GetButtonLabel(button: GamepadButtons?): GameControllerButtonLabel?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IGamepad2> {
    public override fun getValue() = ABI.makeIGamepad2(pointer.getPointer(0))

    public fun setValue(value: IGamepad2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGamepad2, IGamepad.WithDefault, IGameController.WithDefault {
    public val __98106916_Ptr: Pointer?

    public val _98106916_VtblPtr: Pointer?
      get() = __98106916_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetButtonLabel(button: GamepadButtons?): GameControllerButtonLabel? {
      val fnPtr = _98106916_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GameControllerButtonLabel>()
      val hr = fn.invokeHR(arrayOf(__98106916_Ptr, marshalToNative(button), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GameControllerButtonLabel>(result.getValue())
      return resultValue
    }
  }

  public class IGamepad2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IGamepad, IGameController {
    public override val __418806734_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_98106916_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __925471711_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IGameController.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_98106916_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __98106916_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGamepad2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3c1689bd59154245b0c0c89fae0308ff")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGamepad2(ptr: Pointer?): WithDefault = IGamepad2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGamepad2 {
      val address = segment.toRawLongValue()
      return makeIGamepad2(Pointer(address))
    }

    public override fun toNative(obj: IGamepad2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__98106916_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGamepad2): Array<IGamepad2?> = (elements as
        Array<IGamepad2?>).castToImpl<IGamepad2,IGamepad2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGamepad2?> = arrayOfNulls<IGamepad2_Impl>(size)
        as Array<IGamepad2?>
  }
}

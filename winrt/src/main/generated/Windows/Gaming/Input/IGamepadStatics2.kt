package Windows.Gaming.Input

import Windows.Gaming.Input.IGamepadStatics.ABI.IID
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

@ABIMarker(IGamepadStatics2.ABI::class)
@Signature("{42676dc5-0856-47c4-9213-b395504c3a3c}")
@Guid("42676dc5085647c49213b395504c3a3c")
@WinRTInterface("42676dc5085647c49213b395504c3a3c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGamepadStatics2.ByReference::class)
public interface IGamepadStatics2 : NativeMapped, IWinRTInterface, IGamepadStatics {
  @InterfaceMethod(0)
  public fun FromGameController(gameController: IGameController?): Gamepad?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGamepadStatics2> {
    public override fun getValue() = ABI.makeIGamepadStatics2(pointer.getPointer(0))

    public fun setValue(value: IGamepadStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGamepadStatics2, IGamepadStatics.WithDefault {
    public val __1170942715_Ptr: Pointer?

    public val _1170942715_VtblPtr: Pointer?
      get() = __1170942715_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FromGameController(gameController: IGameController?): Gamepad? {
      val fnPtr = _1170942715_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Gamepad>()
      val hr = fn.invokeHR(arrayOf(__1170942715_Ptr, marshalToNative(gameController), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Gamepad>(result.getValue())
      return resultValue
    }
  }

  public class IGamepadStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IGamepadStatics {
    public override val __1070606313_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1170942715_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1170942715_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGamepadStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("42676dc5085647c49213b395504c3a3c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGamepadStatics2(ptr: Pointer?): WithDefault = IGamepadStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGamepadStatics2 {
      val address = segment.toRawLongValue()
      return makeIGamepadStatics2(Pointer(address))
    }

    public override fun toNative(obj: IGamepadStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1170942715_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGamepadStatics2): Array<IGamepadStatics2?> = (elements as
        Array<IGamepadStatics2?>).castToImpl<IGamepadStatics2,IGamepadStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGamepadStatics2?> =
        arrayOfNulls<IGamepadStatics2_Impl>(size) as Array<IGamepadStatics2?>
  }
}

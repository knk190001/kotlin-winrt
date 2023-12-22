package Windows.Gaming.Input

import Windows.Gaming.Input.IRacingWheelStatics.ABI.IID
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

@ABIMarker(IRacingWheelStatics2.ABI::class)
@Signature("{e666bcaa-edfd-4323-a9f6-3c384048d1ed}")
@Guid("e666bcaaedfd4323a9f63c384048d1ed")
@WinRTInterface("e666bcaaedfd4323a9f63c384048d1ed")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRacingWheelStatics2.ByReference::class)
public interface IRacingWheelStatics2 : NativeMapped, IWinRTInterface, IRacingWheelStatics {
  @InterfaceMethod(0)
  public fun FromGameController(gameController: IGameController?): RacingWheel?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRacingWheelStatics2> {
    public override fun getValue() = ABI.makeIRacingWheelStatics2(pointer.getPointer(0))

    public fun setValue(value: IRacingWheelStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRacingWheelStatics2, IRacingWheelStatics.WithDefault {
    public val __150818247_Ptr: Pointer?

    public val _150818247_VtblPtr: Pointer?
      get() = __150818247_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FromGameController(gameController: IGameController?): RacingWheel? {
      val fnPtr = _150818247_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RacingWheel>()
      val hr = fn.invokeHR(arrayOf(__150818247_Ptr, marshalToNative(gameController), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RacingWheel>(result.getValue())
      return resultValue
    }
  }

  public class IRacingWheelStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IRacingWheelStatics {
    public override val __133682229_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_150818247_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __150818247_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRacingWheelStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e666bcaaedfd4323a9f63c384048d1ed")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRacingWheelStatics2(ptr: Pointer?): WithDefault = IRacingWheelStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRacingWheelStatics2 {
      val address = segment.toRawLongValue()
      return makeIRacingWheelStatics2(Pointer(address))
    }

    public override fun toNative(obj: IRacingWheelStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__150818247_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRacingWheelStatics2): Array<IRacingWheelStatics2?> =
        (elements as
        Array<IRacingWheelStatics2?>).castToImpl<IRacingWheelStatics2,IRacingWheelStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRacingWheelStatics2?> =
        arrayOfNulls<IRacingWheelStatics2_Impl>(size) as Array<IRacingWheelStatics2?>
  }
}

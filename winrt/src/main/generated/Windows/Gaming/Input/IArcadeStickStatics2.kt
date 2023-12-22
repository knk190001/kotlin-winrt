package Windows.Gaming.Input

import Windows.Gaming.Input.IArcadeStickStatics.ABI.IID
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

@ABIMarker(IArcadeStickStatics2.ABI::class)
@Signature("{52b5d744-bb86-445a-b59c-596f0e2a49df}")
@Guid("52b5d744bb86445ab59c596f0e2a49df")
@WinRTInterface("52b5d744bb86445ab59c596f0e2a49df")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IArcadeStickStatics2.ByReference::class)
public interface IArcadeStickStatics2 : NativeMapped, IWinRTInterface, IArcadeStickStatics {
  @InterfaceMethod(0)
  public fun FromGameController(gameController: IGameController?): ArcadeStick?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IArcadeStickStatics2> {
    public override fun getValue() = ABI.makeIArcadeStickStatics2(pointer.getPointer(0))

    public fun setValue(value: IArcadeStickStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IArcadeStickStatics2, IArcadeStickStatics.WithDefault {
    public val __1803334790_Ptr: Pointer?

    public val _1803334790_VtblPtr: Pointer?
      get() = __1803334790_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FromGameController(gameController: IGameController?): ArcadeStick? {
      val fnPtr = _1803334790_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ArcadeStick>()
      val hr = fn.invokeHR(arrayOf(__1803334790_Ptr, marshalToNative(gameController), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ArcadeStick>(result.getValue())
      return resultValue
    }
  }

  public class IArcadeStickStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IArcadeStickStatics {
    public override val __473814088_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1803334790_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1803334790_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IArcadeStickStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("52b5d744bb86445ab59c596f0e2a49df")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIArcadeStickStatics2(ptr: Pointer?): WithDefault = IArcadeStickStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IArcadeStickStatics2 {
      val address = segment.toRawLongValue()
      return makeIArcadeStickStatics2(Pointer(address))
    }

    public override fun toNative(obj: IArcadeStickStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1803334790_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IArcadeStickStatics2): Array<IArcadeStickStatics2?> =
        (elements as
        Array<IArcadeStickStatics2?>).castToImpl<IArcadeStickStatics2,IArcadeStickStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IArcadeStickStatics2?> =
        arrayOfNulls<IArcadeStickStatics2_Impl>(size) as Array<IArcadeStickStatics2?>
  }
}

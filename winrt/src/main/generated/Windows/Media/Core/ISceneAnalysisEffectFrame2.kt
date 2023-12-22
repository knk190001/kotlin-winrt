package Windows.Media.Core

import Windows.Foundation.IClosable
import Windows.Media.IMediaFrame
import Windows.Media.IMediaFrame.ABI.IID
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

@ABIMarker(ISceneAnalysisEffectFrame2.ABI::class)
@Signature("{2d4e29be-061f-47ae-9915-02524b5f9a5f}")
@Guid("2d4e29be061f47ae991502524b5f9a5f")
@WinRTInterface("2d4e29be061f47ae991502524b5f9a5f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISceneAnalysisEffectFrame2.ByReference::class)
public interface ISceneAnalysisEffectFrame2 : NativeMapped, IWinRTInterface, IMediaFrame, IClosable
    {
  @InterfaceMethod(0)
  public fun get_AnalysisRecommendation(): SceneAnalysisRecommendation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISceneAnalysisEffectFrame2> {
    public override fun getValue() = ABI.makeISceneAnalysisEffectFrame2(pointer.getPointer(0))

    public fun setValue(value: ISceneAnalysisEffectFrame2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISceneAnalysisEffectFrame2, IMediaFrame.WithDefault,
      IClosable.WithDefault {
    public val __1663023049_Ptr: Pointer?

    public val _1663023049_VtblPtr: Pointer?
      get() = __1663023049_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AnalysisRecommendation(): SceneAnalysisRecommendation? {
      val fnPtr = _1663023049_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SceneAnalysisRecommendation>()
      val hr = fn.invokeHR(arrayOf(__1663023049_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SceneAnalysisRecommendation>(result.getValue())
      return resultValue
    }
  }

  public class ISceneAnalysisEffectFrame2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMediaFrame, IClosable {
    public override val __1156286201_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1663023049_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IClosable.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1663023049_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1663023049_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISceneAnalysisEffectFrame2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2d4e29be061f47ae991502524b5f9a5f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISceneAnalysisEffectFrame2(ptr: Pointer?): WithDefault =
        ISceneAnalysisEffectFrame2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISceneAnalysisEffectFrame2 {
      val address = segment.toRawLongValue()
      return makeISceneAnalysisEffectFrame2(Pointer(address))
    }

    public override fun toNative(obj: ISceneAnalysisEffectFrame2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1663023049_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISceneAnalysisEffectFrame2):
        Array<ISceneAnalysisEffectFrame2?> = (elements as
        Array<ISceneAnalysisEffectFrame2?>).castToImpl<ISceneAnalysisEffectFrame2,ISceneAnalysisEffectFrame2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISceneAnalysisEffectFrame2?> =
        arrayOfNulls<ISceneAnalysisEffectFrame2_Impl>(size) as Array<ISceneAnalysisEffectFrame2?>
  }
}

package Windows.Media.Core

import Windows.Foundation.IClosable
import Windows.Media.Capture.CapturedFrameControlValues
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

@ABIMarker(ISceneAnalysisEffectFrame.ABI::class)
@Signature("{d8b10e4c-7fd9-42e1-85eb-6572c297c987}")
@Guid("d8b10e4c7fd942e185eb6572c297c987")
@WinRTInterface("d8b10e4c7fd942e185eb6572c297c987")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISceneAnalysisEffectFrame.ByReference::class)
public interface ISceneAnalysisEffectFrame : NativeMapped, IWinRTInterface, IMediaFrame, IClosable {
  @InterfaceMethod(0)
  public fun get_FrameControlValues(): CapturedFrameControlValues?

  @InterfaceMethod(1)
  public fun get_HighDynamicRange(): HighDynamicRangeOutput?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISceneAnalysisEffectFrame> {
    public override fun getValue() = ABI.makeISceneAnalysisEffectFrame(pointer.getPointer(0))

    public fun setValue(value: ISceneAnalysisEffectFrame_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISceneAnalysisEffectFrame, IMediaFrame.WithDefault,
      IClosable.WithDefault {
    public val __1993308553_Ptr: Pointer?

    public val _1993308553_VtblPtr: Pointer?
      get() = __1993308553_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FrameControlValues(): CapturedFrameControlValues? {
      val fnPtr = _1993308553_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CapturedFrameControlValues>()
      val hr = fn.invokeHR(arrayOf(__1993308553_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CapturedFrameControlValues>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_HighDynamicRange(): HighDynamicRangeOutput? {
      val fnPtr = _1993308553_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HighDynamicRangeOutput>()
      val hr = fn.invokeHR(arrayOf(__1993308553_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HighDynamicRangeOutput>(result.getValue())
      return resultValue
    }
  }

  public class ISceneAnalysisEffectFrame_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMediaFrame, IClosable {
    public override val __1156286201_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1993308553_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IClosable.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1993308553_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1993308553_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISceneAnalysisEffectFrame, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d8b10e4c7fd942e185eb6572c297c987")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISceneAnalysisEffectFrame(ptr: Pointer?): WithDefault =
        ISceneAnalysisEffectFrame_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISceneAnalysisEffectFrame {
      val address = segment.toRawLongValue()
      return makeISceneAnalysisEffectFrame(Pointer(address))
    }

    public override fun toNative(obj: ISceneAnalysisEffectFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1993308553_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISceneAnalysisEffectFrame):
        Array<ISceneAnalysisEffectFrame?> = (elements as
        Array<ISceneAnalysisEffectFrame?>).castToImpl<ISceneAnalysisEffectFrame,ISceneAnalysisEffectFrame_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISceneAnalysisEffectFrame?> =
        arrayOfNulls<ISceneAnalysisEffectFrame_Impl>(size) as Array<ISceneAnalysisEffectFrame?>
  }
}

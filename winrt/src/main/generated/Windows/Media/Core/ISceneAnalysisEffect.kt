package Windows.Media.Core

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TimeSpan
import Windows.Foundation.TypedEventHandler
import Windows.Media.IMediaExtension
import Windows.Media.IMediaExtension.ABI.IID
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

@ABIMarker(ISceneAnalysisEffect.ABI::class)
@Signature("{c04ba319-ca41-4813-bffd-7b08b0ed2557}")
@Guid("c04ba319ca414813bffd7b08b0ed2557")
@WinRTInterface("c04ba319ca414813bffd7b08b0ed2557")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISceneAnalysisEffect.ByReference::class)
public interface ISceneAnalysisEffect : NativeMapped, IWinRTInterface, IMediaExtension {
  @InterfaceMethod(0)
  public fun get_HighDynamicRangeAnalyzer(): HighDynamicRangeControl?

  @InterfaceMethod(1)
  public fun put_DesiredAnalysisInterval(value: TimeSpan?): Unit

  @InterfaceMethod(2)
  public fun get_DesiredAnalysisInterval(): TimeSpan?

  @InterfaceMethod(3)
  public fun add_SceneAnalyzed(handler: TypedEventHandler<SceneAnalysisEffect?,
      SceneAnalyzedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_SceneAnalyzed(cookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISceneAnalysisEffect> {
    public override fun getValue() = ABI.makeISceneAnalysisEffect(pointer.getPointer(0))

    public fun setValue(value: ISceneAnalysisEffect_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISceneAnalysisEffect, IMediaExtension.WithDefault {
    public val __700451396_Ptr: Pointer?

    public val _700451396_VtblPtr: Pointer?
      get() = __700451396_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HighDynamicRangeAnalyzer(): HighDynamicRangeControl? {
      val fnPtr = _700451396_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HighDynamicRangeControl>()
      val hr = fn.invokeHR(arrayOf(__700451396_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HighDynamicRangeControl>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_DesiredAnalysisInterval(value: TimeSpan?): Unit {
      val fnPtr = _700451396_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__700451396_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_DesiredAnalysisInterval(): TimeSpan? {
      val fnPtr = _700451396_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__700451396_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun add_SceneAnalyzed(handler: TypedEventHandler<SceneAnalysisEffect?,
        SceneAnalyzedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _700451396_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__700451396_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_SceneAnalyzed(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _700451396_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__700451396_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISceneAnalysisEffect_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMediaExtension {
    public override val __9720779_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_700451396_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __700451396_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISceneAnalysisEffect, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c04ba319ca414813bffd7b08b0ed2557")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISceneAnalysisEffect(ptr: Pointer?): WithDefault = ISceneAnalysisEffect_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISceneAnalysisEffect {
      val address = segment.toRawLongValue()
      return makeISceneAnalysisEffect(Pointer(address))
    }

    public override fun toNative(obj: ISceneAnalysisEffect): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__700451396_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISceneAnalysisEffect): Array<ISceneAnalysisEffect?> =
        (elements as
        Array<ISceneAnalysisEffect?>).castToImpl<ISceneAnalysisEffect,ISceneAnalysisEffect_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISceneAnalysisEffect?> =
        arrayOfNulls<ISceneAnalysisEffect_Impl>(size) as Array<ISceneAnalysisEffect?>
  }
}

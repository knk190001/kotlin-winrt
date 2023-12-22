package Windows.Media.Core

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

@ABIMarker(ISceneAnalyzedEventArgs.ABI::class)
@Signature("{146b9588-2851-45e4-ad55-44cf8df8db4d}")
@Guid("146b9588285145e4ad5544cf8df8db4d")
@WinRTInterface("146b9588285145e4ad5544cf8df8db4d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISceneAnalyzedEventArgs.ByReference::class)
public interface ISceneAnalyzedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ResultFrame(): SceneAnalysisEffectFrame?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISceneAnalyzedEventArgs> {
    public override fun getValue() = ABI.makeISceneAnalyzedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISceneAnalyzedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISceneAnalyzedEventArgs {
    public val __1850213064_Ptr: Pointer?

    public val _1850213064_VtblPtr: Pointer?
      get() = __1850213064_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ResultFrame(): SceneAnalysisEffectFrame? {
      val fnPtr = _1850213064_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SceneAnalysisEffectFrame>()
      val hr = fn.invokeHR(arrayOf(__1850213064_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SceneAnalysisEffectFrame>(result.getValue())
      return resultValue
    }
  }

  public class ISceneAnalyzedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1850213064_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISceneAnalyzedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("146b9588285145e4ad5544cf8df8db4d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISceneAnalyzedEventArgs(ptr: Pointer?): WithDefault =
        ISceneAnalyzedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISceneAnalyzedEventArgs {
      val address = segment.toRawLongValue()
      return makeISceneAnalyzedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISceneAnalyzedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1850213064_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISceneAnalyzedEventArgs): Array<ISceneAnalyzedEventArgs?>
        = (elements as
        Array<ISceneAnalyzedEventArgs?>).castToImpl<ISceneAnalyzedEventArgs,ISceneAnalyzedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISceneAnalyzedEventArgs?> =
        arrayOfNulls<ISceneAnalyzedEventArgs_Impl>(size) as Array<ISceneAnalyzedEventArgs?>
  }
}

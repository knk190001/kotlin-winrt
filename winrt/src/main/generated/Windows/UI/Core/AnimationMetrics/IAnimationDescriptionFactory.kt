package Windows.UI.Core.AnimationMetrics

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

@ABIMarker(IAnimationDescriptionFactory.ABI::class)
@Signature("{c6e27abe-c1fb-48b5-9271-ecc70ac86ef0}")
@Guid("c6e27abec1fb48b59271ecc70ac86ef0")
@WinRTInterface("c6e27abec1fb48b59271ecc70ac86ef0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAnimationDescriptionFactory.ByReference::class)
public interface IAnimationDescriptionFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(effect: AnimationEffect?, target: AnimationEffectTarget?):
      AnimationDescription?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAnimationDescriptionFactory> {
    public override fun getValue() = ABI.makeIAnimationDescriptionFactory(pointer.getPointer(0))

    public fun setValue(value: IAnimationDescriptionFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAnimationDescriptionFactory {
    public val __949475864_Ptr: Pointer?

    public val _949475864_VtblPtr: Pointer?
      get() = __949475864_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(effect: AnimationEffect?, target: AnimationEffectTarget?):
        AnimationDescription? {
      val fnPtr = _949475864_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AnimationDescription>()
      val hr = fn.invokeHR(arrayOf(__949475864_Ptr, marshalToNative(effect),
          marshalToNative(target), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AnimationDescription>(result.getValue())
      return resultValue
    }
  }

  public class IAnimationDescriptionFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __949475864_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAnimationDescriptionFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c6e27abec1fb48b59271ecc70ac86ef0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAnimationDescriptionFactory(ptr: Pointer?): WithDefault =
        IAnimationDescriptionFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAnimationDescriptionFactory {
      val address = segment.toRawLongValue()
      return makeIAnimationDescriptionFactory(Pointer(address))
    }

    public override fun toNative(obj: IAnimationDescriptionFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__949475864_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAnimationDescriptionFactory):
        Array<IAnimationDescriptionFactory?> = (elements as
        Array<IAnimationDescriptionFactory?>).castToImpl<IAnimationDescriptionFactory,IAnimationDescriptionFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAnimationDescriptionFactory?> =
        arrayOfNulls<IAnimationDescriptionFactory_Impl>(size) as
        Array<IAnimationDescriptionFactory?>
  }
}

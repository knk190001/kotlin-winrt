package Windows.UI.Xaml.Media.Animation

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IDoubleKeyFrameFactory.ABI::class)
@Signature("{ac97dec3-7538-40b9-b152-696f7fbf4722}")
@Guid("ac97dec3753840b9b152696f7fbf4722")
@WinRTInterface("ac97dec3753840b9b152696f7fbf4722")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDoubleKeyFrameFactory.ByReference::class)
public interface IDoubleKeyFrameFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): DoubleKeyFrame?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDoubleKeyFrameFactory> {
    public override fun getValue() = ABI.makeIDoubleKeyFrameFactory(pointer.getPointer(0))

    public fun setValue(value: IDoubleKeyFrameFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDoubleKeyFrameFactory {
    public val __1201197189_Ptr: Pointer?

    public val _1201197189_VtblPtr: Pointer?
      get() = __1201197189_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        DoubleKeyFrame? {
      val fnPtr = _1201197189_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DoubleKeyFrame>()
      val hr = fn.invokeHR(arrayOf(__1201197189_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DoubleKeyFrame>(result.getValue())
      return resultValue
    }
  }

  public class IDoubleKeyFrameFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1201197189_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDoubleKeyFrameFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ac97dec3753840b9b152696f7fbf4722")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDoubleKeyFrameFactory(ptr: Pointer?): WithDefault =
        IDoubleKeyFrameFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDoubleKeyFrameFactory {
      val address = segment.toRawLongValue()
      return makeIDoubleKeyFrameFactory(Pointer(address))
    }

    public override fun toNative(obj: IDoubleKeyFrameFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1201197189_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDoubleKeyFrameFactory): Array<IDoubleKeyFrameFactory?> =
        (elements as
        Array<IDoubleKeyFrameFactory?>).castToImpl<IDoubleKeyFrameFactory,IDoubleKeyFrameFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDoubleKeyFrameFactory?> =
        arrayOfNulls<IDoubleKeyFrameFactory_Impl>(size) as Array<IDoubleKeyFrameFactory?>
  }
}

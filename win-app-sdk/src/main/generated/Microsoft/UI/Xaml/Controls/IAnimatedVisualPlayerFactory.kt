package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IAnimatedVisualPlayerFactory.ABI::class)
@Signature("{ebc0c6e6-c91a-5025-b4a4-e786d83be1d8}")
@Guid("ebc0c6e6c91a5025b4a4e786d83be1d8")
@WinRTInterface("ebc0c6e6c91a5025b4a4e786d83be1d8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAnimatedVisualPlayerFactory.ByReference::class)
public interface IAnimatedVisualPlayerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      AnimatedVisualPlayer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAnimatedVisualPlayerFactory> {
    public override fun getValue() = ABI.makeIAnimatedVisualPlayerFactory(pointer.getPointer(0))

    public fun setValue(value: IAnimatedVisualPlayerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAnimatedVisualPlayerFactory {
    public val __1548805441_Ptr: Pointer?

    public val _1548805441_VtblPtr: Pointer?
      get() = __1548805441_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        AnimatedVisualPlayer? {
      val fnPtr = _1548805441_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AnimatedVisualPlayer>()
      val hr = fn.invokeHR(arrayOf(__1548805441_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AnimatedVisualPlayer>(result.getValue())
      return resultValue
    }
  }

  public class IAnimatedVisualPlayerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1548805441_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAnimatedVisualPlayerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ebc0c6e6c91a5025b4a4e786d83be1d8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAnimatedVisualPlayerFactory(ptr: Pointer?): WithDefault =
        IAnimatedVisualPlayerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAnimatedVisualPlayerFactory {
      val address = segment.toRawLongValue()
      return makeIAnimatedVisualPlayerFactory(Pointer(address))
    }

    public override fun toNative(obj: IAnimatedVisualPlayerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1548805441_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAnimatedVisualPlayerFactory):
        Array<IAnimatedVisualPlayerFactory?> = (elements as
        Array<IAnimatedVisualPlayerFactory?>).castToImpl<IAnimatedVisualPlayerFactory,IAnimatedVisualPlayerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAnimatedVisualPlayerFactory?> =
        arrayOfNulls<IAnimatedVisualPlayerFactory_Impl>(size) as
        Array<IAnimatedVisualPlayerFactory?>
  }
}

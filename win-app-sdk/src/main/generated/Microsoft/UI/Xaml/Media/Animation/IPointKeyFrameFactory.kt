package Microsoft.UI.Xaml.Media.Animation

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

@ABIMarker(IPointKeyFrameFactory.ABI::class)
@Signature("{c52ee293-f10e-5252-bc08-a28659740f0e}")
@Guid("c52ee293f10e5252bc08a28659740f0e")
@WinRTInterface("c52ee293f10e5252bc08a28659740f0e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPointKeyFrameFactory.ByReference::class)
public interface IPointKeyFrameFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): PointKeyFrame?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPointKeyFrameFactory> {
    public override fun getValue() = ABI.makeIPointKeyFrameFactory(pointer.getPointer(0))

    public fun setValue(value: IPointKeyFrameFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPointKeyFrameFactory {
    public val __1107913127_Ptr: Pointer?

    public val _1107913127_VtblPtr: Pointer?
      get() = __1107913127_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        PointKeyFrame? {
      val fnPtr = _1107913127_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PointKeyFrame>()
      val hr = fn.invokeHR(arrayOf(__1107913127_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PointKeyFrame>(result.getValue())
      return resultValue
    }
  }

  public class IPointKeyFrameFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1107913127_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPointKeyFrameFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c52ee293f10e5252bc08a28659740f0e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPointKeyFrameFactory(ptr: Pointer?): WithDefault =
        IPointKeyFrameFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPointKeyFrameFactory {
      val address = segment.toRawLongValue()
      return makeIPointKeyFrameFactory(Pointer(address))
    }

    public override fun toNative(obj: IPointKeyFrameFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1107913127_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPointKeyFrameFactory): Array<IPointKeyFrameFactory?> =
        (elements as
        Array<IPointKeyFrameFactory?>).castToImpl<IPointKeyFrameFactory,IPointKeyFrameFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPointKeyFrameFactory?> =
        arrayOfNulls<IPointKeyFrameFactory_Impl>(size) as Array<IPointKeyFrameFactory?>
  }
}

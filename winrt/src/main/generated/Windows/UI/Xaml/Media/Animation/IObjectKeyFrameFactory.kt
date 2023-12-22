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

@ABIMarker(IObjectKeyFrameFactory.ABI::class)
@Signature("{1626143e-3e6d-44d8-9b9a-04aea70f8492}")
@Guid("1626143e3e6d44d89b9a04aea70f8492")
@WinRTInterface("1626143e3e6d44d89b9a04aea70f8492")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IObjectKeyFrameFactory.ByReference::class)
public interface IObjectKeyFrameFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): ObjectKeyFrame?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IObjectKeyFrameFactory> {
    public override fun getValue() = ABI.makeIObjectKeyFrameFactory(pointer.getPointer(0))

    public fun setValue(value: IObjectKeyFrameFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IObjectKeyFrameFactory {
    public val __404086953_Ptr: Pointer?

    public val _404086953_VtblPtr: Pointer?
      get() = __404086953_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        ObjectKeyFrame? {
      val fnPtr = _404086953_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ObjectKeyFrame>()
      val hr = fn.invokeHR(arrayOf(__404086953_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ObjectKeyFrame>(result.getValue())
      return resultValue
    }
  }

  public class IObjectKeyFrameFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __404086953_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IObjectKeyFrameFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1626143e3e6d44d89b9a04aea70f8492")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIObjectKeyFrameFactory(ptr: Pointer?): WithDefault =
        IObjectKeyFrameFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IObjectKeyFrameFactory {
      val address = segment.toRawLongValue()
      return makeIObjectKeyFrameFactory(Pointer(address))
    }

    public override fun toNative(obj: IObjectKeyFrameFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__404086953_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IObjectKeyFrameFactory): Array<IObjectKeyFrameFactory?> =
        (elements as
        Array<IObjectKeyFrameFactory?>).castToImpl<IObjectKeyFrameFactory,IObjectKeyFrameFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IObjectKeyFrameFactory?> =
        arrayOfNulls<IObjectKeyFrameFactory_Impl>(size) as Array<IObjectKeyFrameFactory?>
  }
}

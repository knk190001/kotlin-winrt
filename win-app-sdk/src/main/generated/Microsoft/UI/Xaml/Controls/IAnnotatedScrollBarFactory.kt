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

@ABIMarker(IAnnotatedScrollBarFactory.ABI::class)
@Signature("{3f64c40f-b879-5020-b67c-b789e173c798}")
@Guid("3f64c40fb8795020b67cb789e173c798")
@WinRTInterface("3f64c40fb8795020b67cb789e173c798")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAnnotatedScrollBarFactory.ByReference::class)
public interface IAnnotatedScrollBarFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      AnnotatedScrollBar?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAnnotatedScrollBarFactory> {
    public override fun getValue() = ABI.makeIAnnotatedScrollBarFactory(pointer.getPointer(0))

    public fun setValue(value: IAnnotatedScrollBarFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAnnotatedScrollBarFactory {
    public val __461915381_Ptr: Pointer?

    public val _461915381_VtblPtr: Pointer?
      get() = __461915381_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        AnnotatedScrollBar? {
      val fnPtr = _461915381_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AnnotatedScrollBar>()
      val hr = fn.invokeHR(arrayOf(__461915381_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AnnotatedScrollBar>(result.getValue())
      return resultValue
    }
  }

  public class IAnnotatedScrollBarFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __461915381_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAnnotatedScrollBarFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3f64c40fb8795020b67cb789e173c798")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAnnotatedScrollBarFactory(ptr: Pointer?): WithDefault =
        IAnnotatedScrollBarFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAnnotatedScrollBarFactory {
      val address = segment.toRawLongValue()
      return makeIAnnotatedScrollBarFactory(Pointer(address))
    }

    public override fun toNative(obj: IAnnotatedScrollBarFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__461915381_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAnnotatedScrollBarFactory):
        Array<IAnnotatedScrollBarFactory?> = (elements as
        Array<IAnnotatedScrollBarFactory?>).castToImpl<IAnnotatedScrollBarFactory,IAnnotatedScrollBarFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAnnotatedScrollBarFactory?> =
        arrayOfNulls<IAnnotatedScrollBarFactory_Impl>(size) as Array<IAnnotatedScrollBarFactory?>
  }
}

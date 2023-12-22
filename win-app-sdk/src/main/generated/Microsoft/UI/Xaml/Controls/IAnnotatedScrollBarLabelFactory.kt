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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAnnotatedScrollBarLabelFactory.ABI::class)
@Signature("{b6169805-c01c-54c6-80e8-c6c98f9aaa53}")
@Guid("b6169805c01c54c680e8c6c98f9aaa53")
@WinRTInterface("b6169805c01c54c680e8c6c98f9aaa53")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAnnotatedScrollBarLabelFactory.ByReference::class)
public interface IAnnotatedScrollBarLabelFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(content: IUnknown?, scrollOffset: Double): AnnotatedScrollBarLabel?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAnnotatedScrollBarLabelFactory> {
    public override fun getValue() = ABI.makeIAnnotatedScrollBarLabelFactory(pointer.getPointer(0))

    public fun setValue(value: IAnnotatedScrollBarLabelFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAnnotatedScrollBarLabelFactory {
    public val __1670187413_Ptr: Pointer?

    public val _1670187413_VtblPtr: Pointer?
      get() = __1670187413_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(content: IUnknown?, scrollOffset: Double):
        AnnotatedScrollBarLabel? {
      val fnPtr = _1670187413_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AnnotatedScrollBarLabel>()
      val hr = fn.invokeHR(arrayOf(__1670187413_Ptr, marshalToNative(content), scrollOffset,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AnnotatedScrollBarLabel>(result.getValue())
      return resultValue
    }
  }

  public class IAnnotatedScrollBarLabelFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1670187413_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAnnotatedScrollBarLabelFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b6169805c01c54c680e8c6c98f9aaa53")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAnnotatedScrollBarLabelFactory(ptr: Pointer?): WithDefault =
        IAnnotatedScrollBarLabelFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAnnotatedScrollBarLabelFactory {
      val address = segment.toRawLongValue()
      return makeIAnnotatedScrollBarLabelFactory(Pointer(address))
    }

    public override fun toNative(obj: IAnnotatedScrollBarLabelFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1670187413_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAnnotatedScrollBarLabelFactory):
        Array<IAnnotatedScrollBarLabelFactory?> = (elements as
        Array<IAnnotatedScrollBarLabelFactory?>).castToImpl<IAnnotatedScrollBarLabelFactory,IAnnotatedScrollBarLabelFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAnnotatedScrollBarLabelFactory?> =
        arrayOfNulls<IAnnotatedScrollBarLabelFactory_Impl>(size) as
        Array<IAnnotatedScrollBarLabelFactory?>
  }
}

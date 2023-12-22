package Microsoft.UI.Xaml.Data

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPropertyChangedEventArgsFactory.ABI::class)
@Signature("{7c0c27a8-0b41-5070-b160-fc9ae960a36c}")
@Guid("7c0c27a80b415070b160fc9ae960a36c")
@WinRTInterface("7c0c27a80b415070b160fc9ae960a36c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPropertyChangedEventArgsFactory.ByReference::class)
public interface IPropertyChangedEventArgsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(
    name: String?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): PropertyChangedEventArgs?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPropertyChangedEventArgsFactory> {
    public override fun getValue() = ABI.makeIPropertyChangedEventArgsFactory(pointer.getPointer(0))

    public fun setValue(value: IPropertyChangedEventArgsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPropertyChangedEventArgsFactory {
    public val __289855489_Ptr: Pointer?

    public val _289855489_VtblPtr: Pointer?
      get() = __289855489_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(
      name: String?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): PropertyChangedEventArgs? {
      val fnPtr = _289855489_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PropertyChangedEventArgs>()
      val hr = fn.invokeHR(arrayOf(__289855489_Ptr, marshalToNative(name),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PropertyChangedEventArgs>(result.getValue())
      return resultValue
    }
  }

  public class IPropertyChangedEventArgsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __289855489_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPropertyChangedEventArgsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7c0c27a80b415070b160fc9ae960a36c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPropertyChangedEventArgsFactory(ptr: Pointer?): WithDefault =
        IPropertyChangedEventArgsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPropertyChangedEventArgsFactory {
      val address = segment.toRawLongValue()
      return makeIPropertyChangedEventArgsFactory(Pointer(address))
    }

    public override fun toNative(obj: IPropertyChangedEventArgsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__289855489_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPropertyChangedEventArgsFactory):
        Array<IPropertyChangedEventArgsFactory?> = (elements as
        Array<IPropertyChangedEventArgsFactory?>).castToImpl<IPropertyChangedEventArgsFactory,IPropertyChangedEventArgsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPropertyChangedEventArgsFactory?> =
        arrayOfNulls<IPropertyChangedEventArgsFactory_Impl>(size) as
        Array<IPropertyChangedEventArgsFactory?>
  }
}

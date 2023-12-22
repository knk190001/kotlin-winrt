package Microsoft.UI.Xaml.Data

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDataErrorsChangedEventArgsFactory.ABI::class)
@Signature("{62d0bd1e-b85f-5fcc-842a-7cb0dda37fe5}")
@Guid("62d0bd1eb85f5fcc842a7cb0dda37fe5")
@WinRTInterface("62d0bd1eb85f5fcc842a7cb0dda37fe5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataErrorsChangedEventArgsFactory.ByReference::class)
public interface IDataErrorsChangedEventArgsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(name: String?): DataErrorsChangedEventArgs?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDataErrorsChangedEventArgsFactory> {
    public override fun getValue() =
        ABI.makeIDataErrorsChangedEventArgsFactory(pointer.getPointer(0))

    public fun setValue(value: IDataErrorsChangedEventArgsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataErrorsChangedEventArgsFactory {
    public val __440391969_Ptr: Pointer?

    public val _440391969_VtblPtr: Pointer?
      get() = __440391969_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(name: String?): DataErrorsChangedEventArgs? {
      val fnPtr = _440391969_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataErrorsChangedEventArgs>()
      val hr = fn.invokeHR(arrayOf(__440391969_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataErrorsChangedEventArgs>(result.getValue())
      return resultValue
    }
  }

  public class IDataErrorsChangedEventArgsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __440391969_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataErrorsChangedEventArgsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("62d0bd1eb85f5fcc842a7cb0dda37fe5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataErrorsChangedEventArgsFactory(ptr: Pointer?): WithDefault =
        IDataErrorsChangedEventArgsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataErrorsChangedEventArgsFactory {
      val address = segment.toRawLongValue()
      return makeIDataErrorsChangedEventArgsFactory(Pointer(address))
    }

    public override fun toNative(obj: IDataErrorsChangedEventArgsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__440391969_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataErrorsChangedEventArgsFactory):
        Array<IDataErrorsChangedEventArgsFactory?> = (elements as
        Array<IDataErrorsChangedEventArgsFactory?>).castToImpl<IDataErrorsChangedEventArgsFactory,IDataErrorsChangedEventArgsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataErrorsChangedEventArgsFactory?> =
        arrayOfNulls<IDataErrorsChangedEventArgsFactory_Impl>(size) as
        Array<IDataErrorsChangedEventArgsFactory?>
  }
}

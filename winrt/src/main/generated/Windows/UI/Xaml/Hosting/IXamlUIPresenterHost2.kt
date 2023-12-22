package Windows.UI.Xaml.Hosting

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

@ABIMarker(IXamlUIPresenterHost2.ABI::class)
@Signature("{61595672-7ca4-4a21-b56a-88f4812388ca}")
@Guid("615956727ca44a21b56a88f4812388ca")
@WinRTInterface("615956727ca44a21b56a88f4812388ca")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlUIPresenterHost2.ByReference::class)
public interface IXamlUIPresenterHost2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetGenericXamlFilePath(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXamlUIPresenterHost2> {
    public override fun getValue() = ABI.makeIXamlUIPresenterHost2(pointer.getPointer(0))

    public fun setValue(value: IXamlUIPresenterHost2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlUIPresenterHost2 {
    public val __815183260_Ptr: Pointer?

    public val _815183260_VtblPtr: Pointer?
      get() = __815183260_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetGenericXamlFilePath(): String? {
      val fnPtr = _815183260_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__815183260_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IXamlUIPresenterHost2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __815183260_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlUIPresenterHost2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("615956727ca44a21b56a88f4812388ca")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlUIPresenterHost2(ptr: Pointer?): WithDefault =
        IXamlUIPresenterHost2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlUIPresenterHost2 {
      val address = segment.toRawLongValue()
      return makeIXamlUIPresenterHost2(Pointer(address))
    }

    public override fun toNative(obj: IXamlUIPresenterHost2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__815183260_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlUIPresenterHost2): Array<IXamlUIPresenterHost2?> =
        (elements as
        Array<IXamlUIPresenterHost2?>).castToImpl<IXamlUIPresenterHost2,IXamlUIPresenterHost2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlUIPresenterHost2?> =
        arrayOfNulls<IXamlUIPresenterHost2_Impl>(size) as Array<IXamlUIPresenterHost2?>
  }
}

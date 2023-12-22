package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DataTemplate
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

@ABIMarker(IDataTemplateSelector2.ABI::class)
@Signature("{3792bc47-8c4b-4257-a5ae-cc3f8ed786eb}")
@Guid("3792bc478c4b4257a5aecc3f8ed786eb")
@WinRTInterface("3792bc478c4b4257a5aecc3f8ed786eb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataTemplateSelector2.ByReference::class)
public interface IDataTemplateSelector2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SelectTemplate(item: IUnknown?): DataTemplate?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDataTemplateSelector2> {
    public override fun getValue() = ABI.makeIDataTemplateSelector2(pointer.getPointer(0))

    public fun setValue(value: IDataTemplateSelector2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataTemplateSelector2 {
    public val __681192371_Ptr: Pointer?

    public val _681192371_VtblPtr: Pointer?
      get() = __681192371_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SelectTemplate(item: IUnknown?): DataTemplate? {
      val fnPtr = _681192371_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__681192371_Ptr, marshalToNative(item), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }
  }

  public class IDataTemplateSelector2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __681192371_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataTemplateSelector2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3792bc478c4b4257a5aecc3f8ed786eb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataTemplateSelector2(ptr: Pointer?): WithDefault =
        IDataTemplateSelector2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataTemplateSelector2 {
      val address = segment.toRawLongValue()
      return makeIDataTemplateSelector2(Pointer(address))
    }

    public override fun toNative(obj: IDataTemplateSelector2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__681192371_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataTemplateSelector2): Array<IDataTemplateSelector2?> =
        (elements as
        Array<IDataTemplateSelector2?>).castToImpl<IDataTemplateSelector2,IDataTemplateSelector2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataTemplateSelector2?> =
        arrayOfNulls<IDataTemplateSelector2_Impl>(size) as Array<IDataTemplateSelector2?>
  }
}

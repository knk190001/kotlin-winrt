package Windows.UI.Xaml.Controls

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

@ABIMarker(ITreeViewItemTemplateSettingsFactory.ABI::class)
@Signature("{11a1953b-31b7-4f40-8633-02fc614b518c}")
@Guid("11a1953b31b74f40863302fc614b518c")
@WinRTInterface("11a1953b31b74f40863302fc614b518c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITreeViewItemTemplateSettingsFactory.ByReference::class)
public interface ITreeViewItemTemplateSettingsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      TreeViewItemTemplateSettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITreeViewItemTemplateSettingsFactory> {
    public override fun getValue() =
        ABI.makeITreeViewItemTemplateSettingsFactory(pointer.getPointer(0))

    public fun setValue(value: ITreeViewItemTemplateSettingsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITreeViewItemTemplateSettingsFactory {
    public val __1295287301_Ptr: Pointer?

    public val _1295287301_VtblPtr: Pointer?
      get() = __1295287301_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        TreeViewItemTemplateSettings? {
      val fnPtr = _1295287301_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TreeViewItemTemplateSettings>()
      val hr = fn.invokeHR(arrayOf(__1295287301_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TreeViewItemTemplateSettings>(result.getValue())
      return resultValue
    }
  }

  public class ITreeViewItemTemplateSettingsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1295287301_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITreeViewItemTemplateSettingsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("11a1953b31b74f40863302fc614b518c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITreeViewItemTemplateSettingsFactory(ptr: Pointer?): WithDefault =
        ITreeViewItemTemplateSettingsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITreeViewItemTemplateSettingsFactory {
      val address = segment.toRawLongValue()
      return makeITreeViewItemTemplateSettingsFactory(Pointer(address))
    }

    public override fun toNative(obj: ITreeViewItemTemplateSettingsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1295287301_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITreeViewItemTemplateSettingsFactory):
        Array<ITreeViewItemTemplateSettingsFactory?> = (elements as
        Array<ITreeViewItemTemplateSettingsFactory?>).castToImpl<ITreeViewItemTemplateSettingsFactory,ITreeViewItemTemplateSettingsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITreeViewItemTemplateSettingsFactory?> =
        arrayOfNulls<ITreeViewItemTemplateSettingsFactory_Impl>(size) as
        Array<ITreeViewItemTemplateSettingsFactory?>
  }
}

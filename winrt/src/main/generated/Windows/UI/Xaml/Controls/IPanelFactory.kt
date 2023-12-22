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

@ABIMarker(IPanelFactory.ABI::class)
@Signature("{eee68111-c7cc-433f-95cd-d630c34302dd}")
@Guid("eee68111c7cc433f95cdd630c34302dd")
@WinRTInterface("eee68111c7cc433f95cdd630c34302dd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPanelFactory.ByReference::class)
public interface IPanelFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): Panel?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPanelFactory>
      {
    public override fun getValue() = ABI.makeIPanelFactory(pointer.getPointer(0))

    public fun setValue(value: IPanelFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPanelFactory {
    public val __2059778942_Ptr: Pointer?

    public val _2059778942_VtblPtr: Pointer?
      get() = __2059778942_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        Panel? {
      val fnPtr = _2059778942_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Panel>()
      val hr = fn.invokeHR(arrayOf(__2059778942_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Panel>(result.getValue())
      return resultValue
    }
  }

  public class IPanelFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2059778942_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPanelFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("eee68111c7cc433f95cdd630c34302dd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPanelFactory(ptr: Pointer?): WithDefault = IPanelFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPanelFactory {
      val address = segment.toRawLongValue()
      return makeIPanelFactory(Pointer(address))
    }

    public override fun toNative(obj: IPanelFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2059778942_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPanelFactory): Array<IPanelFactory?> = (elements as
        Array<IPanelFactory?>).castToImpl<IPanelFactory,IPanelFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPanelFactory?> =
        arrayOfNulls<IPanelFactory_Impl>(size) as Array<IPanelFactory?>
  }
}

package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DependencyProperty
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRefreshContainerStatics.ABI::class)
@Signature("{875ef8a0-74c2-5201-b708-50a48e7e7601}")
@Guid("875ef8a074c25201b70850a48e7e7601")
@WinRTInterface("875ef8a074c25201b70850a48e7e7601")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRefreshContainerStatics.ByReference::class)
public interface IRefreshContainerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_VisualizerProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_PullDirectionProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRefreshContainerStatics> {
    public override fun getValue() = ABI.makeIRefreshContainerStatics(pointer.getPointer(0))

    public fun setValue(value: IRefreshContainerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRefreshContainerStatics {
    public val __321440600_Ptr: Pointer?

    public val _321440600_VtblPtr: Pointer?
      get() = __321440600_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_VisualizerProperty(): DependencyProperty? {
      val fnPtr = _321440600_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__321440600_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PullDirectionProperty(): DependencyProperty? {
      val fnPtr = _321440600_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__321440600_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IRefreshContainerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __321440600_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRefreshContainerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("875ef8a074c25201b70850a48e7e7601")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRefreshContainerStatics(ptr: Pointer?): WithDefault =
        IRefreshContainerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRefreshContainerStatics {
      val address = segment.toRawLongValue()
      return makeIRefreshContainerStatics(Pointer(address))
    }

    public override fun toNative(obj: IRefreshContainerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__321440600_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRefreshContainerStatics):
        Array<IRefreshContainerStatics?> = (elements as
        Array<IRefreshContainerStatics?>).castToImpl<IRefreshContainerStatics,IRefreshContainerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRefreshContainerStatics?> =
        arrayOfNulls<IRefreshContainerStatics_Impl>(size) as Array<IRefreshContainerStatics?>
  }
}

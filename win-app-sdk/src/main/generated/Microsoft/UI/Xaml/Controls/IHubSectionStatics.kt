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

@ABIMarker(IHubSectionStatics.ABI::class)
@Signature("{d22016d3-fb4a-5bd8-a108-e59f7c475927}")
@Guid("d22016d3fb4a5bd8a108e59f7c475927")
@WinRTInterface("d22016d3fb4a5bd8a108e59f7c475927")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHubSectionStatics.ByReference::class)
public interface IHubSectionStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HeaderProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_HeaderTemplateProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_ContentTemplateProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_IsHeaderInteractiveProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHubSectionStatics> {
    public override fun getValue() = ABI.makeIHubSectionStatics(pointer.getPointer(0))

    public fun setValue(value: IHubSectionStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHubSectionStatics {
    public val __945628814_Ptr: Pointer?

    public val _945628814_VtblPtr: Pointer?
      get() = __945628814_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HeaderProperty(): DependencyProperty? {
      val fnPtr = _945628814_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__945628814_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_HeaderTemplateProperty(): DependencyProperty? {
      val fnPtr = _945628814_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__945628814_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ContentTemplateProperty(): DependencyProperty? {
      val fnPtr = _945628814_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__945628814_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_IsHeaderInteractiveProperty(): DependencyProperty? {
      val fnPtr = _945628814_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__945628814_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IHubSectionStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __945628814_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHubSectionStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d22016d3fb4a5bd8a108e59f7c475927")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHubSectionStatics(ptr: Pointer?): WithDefault = IHubSectionStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHubSectionStatics {
      val address = segment.toRawLongValue()
      return makeIHubSectionStatics(Pointer(address))
    }

    public override fun toNative(obj: IHubSectionStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__945628814_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHubSectionStatics): Array<IHubSectionStatics?> =
        (elements as
        Array<IHubSectionStatics?>).castToImpl<IHubSectionStatics,IHubSectionStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHubSectionStatics?> =
        arrayOfNulls<IHubSectionStatics_Impl>(size) as Array<IHubSectionStatics?>
  }
}

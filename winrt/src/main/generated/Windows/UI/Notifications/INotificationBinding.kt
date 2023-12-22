package Windows.UI.Notifications

import Windows.Foundation.Collections.IMap
import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(INotificationBinding.ABI::class)
@Signature("{f29e4b85-0370-4ad3-b4ea-da9e35e7eabf}")
@Guid("f29e4b8503704ad3b4eada9e35e7eabf")
@WinRTInterface("f29e4b8503704ad3b4eada9e35e7eabf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INotificationBinding.ByReference::class)
public interface INotificationBinding : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Template(): String?

  @InterfaceMethod(1)
  public fun put_Template(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Language(): String?

  @InterfaceMethod(3)
  public fun put_Language(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_Hints(): IMap<String?, String?>?

  @InterfaceMethod(5)
  public fun GetTextElements(): IVectorView<AdaptiveNotificationText?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INotificationBinding> {
    public override fun getValue() = ABI.makeINotificationBinding(pointer.getPointer(0))

    public fun setValue(value: INotificationBinding_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INotificationBinding {
    public val __1917559978_Ptr: Pointer?

    public val _1917559978_VtblPtr: Pointer?
      get() = __1917559978_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Template(): String? {
      val fnPtr = _1917559978_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1917559978_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Template(value: String?): Unit {
      val fnPtr = _1917559978_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1917559978_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Language(): String? {
      val fnPtr = _1917559978_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1917559978_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Language(value: String?): Unit {
      val fnPtr = _1917559978_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1917559978_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Hints(): IMap<String?, String?>? {
      val fnPtr = _1917559978_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMap<String?, String?>>()
      val hr = fn.invokeHR(arrayOf(__1917559978_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMap<String?, String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetTextElements(): IVectorView<AdaptiveNotificationText?>? {
      val fnPtr = _1917559978_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<AdaptiveNotificationText?>>()
      val hr = fn.invokeHR(arrayOf(__1917559978_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<AdaptiveNotificationText?>>(result.getValue())
      return resultValue
    }
  }

  public class INotificationBinding_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1917559978_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INotificationBinding, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f29e4b8503704ad3b4eada9e35e7eabf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINotificationBinding(ptr: Pointer?): WithDefault = INotificationBinding_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INotificationBinding {
      val address = segment.toRawLongValue()
      return makeINotificationBinding(Pointer(address))
    }

    public override fun toNative(obj: INotificationBinding): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1917559978_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INotificationBinding): Array<INotificationBinding?> =
        (elements as
        Array<INotificationBinding?>).castToImpl<INotificationBinding,INotificationBinding_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INotificationBinding?> =
        arrayOfNulls<INotificationBinding_Impl>(size) as Array<INotificationBinding?>
  }
}

package Microsoft.UI.Xaml.Automation.Provider

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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDragProvider.ABI::class)
@Signature("{c60bb643-a356-5132-a258-ffba6c7480f2}")
@Guid("c60bb643a3565132a258ffba6c7480f2")
@WinRTInterface("c60bb643a3565132a258ffba6c7480f2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDragProvider.ByReference::class)
public interface IDragProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsGrabbed(): Boolean

  @InterfaceMethod(1)
  public fun get_DropEffect(): String?

  @InterfaceMethod(2)
  public fun get_DropEffects(): Array<String?>?

  @InterfaceMethod(3)
  public fun GetGrabbedItems(): Array<IRawElementProviderSimple?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDragProvider>
      {
    public override fun getValue() = ABI.makeIDragProvider(pointer.getPointer(0))

    public fun setValue(value: IDragProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDragProvider {
    public val __1343670702_Ptr: Pointer?

    public val _1343670702_VtblPtr: Pointer?
      get() = __1343670702_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsGrabbed(): Boolean {
      val fnPtr = _1343670702_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1343670702_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_DropEffect(): String? {
      val fnPtr = _1343670702_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1343670702_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_DropEffects(): Array<String?>? {
      val fnPtr = _1343670702_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeOutArray<String>()
      val hr = fn.invokeHR(arrayOf(__1343670702_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetGrabbedItems(): Array<IRawElementProviderSimple?>? {
      val fnPtr = _1343670702_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeOutArray<IRawElementProviderSimple>()
      val hr = fn.invokeHR(arrayOf(__1343670702_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }
  }

  public class IDragProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1343670702_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDragProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c60bb643a3565132a258ffba6c7480f2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDragProvider(ptr: Pointer?): WithDefault = IDragProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDragProvider {
      val address = segment.toRawLongValue()
      return makeIDragProvider(Pointer(address))
    }

    public override fun toNative(obj: IDragProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1343670702_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDragProvider): Array<IDragProvider?> = (elements as
        Array<IDragProvider?>).castToImpl<IDragProvider,IDragProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDragProvider?> =
        arrayOfNulls<IDragProvider_Impl>(size) as Array<IDragProvider?>
  }
}

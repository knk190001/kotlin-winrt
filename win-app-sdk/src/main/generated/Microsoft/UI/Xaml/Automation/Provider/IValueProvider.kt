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

@ABIMarker(IValueProvider.ABI::class)
@Signature("{984f11cf-4611-588e-b52e-b96a12322c71}")
@Guid("984f11cf4611588eb52eb96a12322c71")
@WinRTInterface("984f11cf4611588eb52eb96a12322c71")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IValueProvider.ByReference::class)
public interface IValueProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsReadOnly(): Boolean

  @InterfaceMethod(1)
  public fun get_Value(): String?

  @InterfaceMethod(2)
  public fun SetValue(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IValueProvider>
      {
    public override fun getValue() = ABI.makeIValueProvider(pointer.getPointer(0))

    public fun setValue(value: IValueProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IValueProvider {
    public val __1118783765_Ptr: Pointer?

    public val _1118783765_VtblPtr: Pointer?
      get() = __1118783765_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsReadOnly(): Boolean {
      val fnPtr = _1118783765_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1118783765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Value(): String? {
      val fnPtr = _1118783765_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1118783765_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SetValue(value: String?): Unit {
      val fnPtr = _1118783765_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1118783765_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IValueProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1118783765_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IValueProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("984f11cf4611588eb52eb96a12322c71")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIValueProvider(ptr: Pointer?): WithDefault = IValueProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IValueProvider {
      val address = segment.toRawLongValue()
      return makeIValueProvider(Pointer(address))
    }

    public override fun toNative(obj: IValueProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1118783765_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IValueProvider): Array<IValueProvider?> = (elements as
        Array<IValueProvider?>).castToImpl<IValueProvider,IValueProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IValueProvider?> =
        arrayOfNulls<IValueProvider_Impl>(size) as Array<IValueProvider?>
  }
}

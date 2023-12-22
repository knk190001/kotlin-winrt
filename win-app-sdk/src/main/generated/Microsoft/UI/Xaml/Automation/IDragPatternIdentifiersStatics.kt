package Microsoft.UI.Xaml.Automation

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

@ABIMarker(IDragPatternIdentifiersStatics.ABI::class)
@Signature("{482eee70-0bfc-5552-9e7d-8dffc526b2f7}")
@Guid("482eee700bfc55529e7d8dffc526b2f7")
@WinRTInterface("482eee700bfc55529e7d8dffc526b2f7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDragPatternIdentifiersStatics.ByReference::class)
public interface IDragPatternIdentifiersStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DropEffectProperty(): AutomationProperty?

  @InterfaceMethod(1)
  public fun get_DropEffectsProperty(): AutomationProperty?

  @InterfaceMethod(2)
  public fun get_GrabbedItemsProperty(): AutomationProperty?

  @InterfaceMethod(3)
  public fun get_IsGrabbedProperty(): AutomationProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDragPatternIdentifiersStatics> {
    public override fun getValue() = ABI.makeIDragPatternIdentifiersStatics(pointer.getPointer(0))

    public fun setValue(value: IDragPatternIdentifiersStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDragPatternIdentifiersStatics {
    public val __1327700881_Ptr: Pointer?

    public val _1327700881_VtblPtr: Pointer?
      get() = __1327700881_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DropEffectProperty(): AutomationProperty? {
      val fnPtr = _1327700881_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__1327700881_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DropEffectsProperty(): AutomationProperty? {
      val fnPtr = _1327700881_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__1327700881_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_GrabbedItemsProperty(): AutomationProperty? {
      val fnPtr = _1327700881_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__1327700881_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_IsGrabbedProperty(): AutomationProperty? {
      val fnPtr = _1327700881_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__1327700881_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }
  }

  public class IDragPatternIdentifiersStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1327700881_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDragPatternIdentifiersStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("482eee700bfc55529e7d8dffc526b2f7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDragPatternIdentifiersStatics(ptr: Pointer?): WithDefault =
        IDragPatternIdentifiersStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDragPatternIdentifiersStatics {
      val address = segment.toRawLongValue()
      return makeIDragPatternIdentifiersStatics(Pointer(address))
    }

    public override fun toNative(obj: IDragPatternIdentifiersStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1327700881_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDragPatternIdentifiersStatics):
        Array<IDragPatternIdentifiersStatics?> = (elements as
        Array<IDragPatternIdentifiersStatics?>).castToImpl<IDragPatternIdentifiersStatics,IDragPatternIdentifiersStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDragPatternIdentifiersStatics?> =
        arrayOfNulls<IDragPatternIdentifiersStatics_Impl>(size) as
        Array<IDragPatternIdentifiersStatics?>
  }
}

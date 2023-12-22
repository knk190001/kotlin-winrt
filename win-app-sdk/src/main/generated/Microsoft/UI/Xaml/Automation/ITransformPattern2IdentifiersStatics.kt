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

@ABIMarker(ITransformPattern2IdentifiersStatics.ABI::class)
@Signature("{d9876ff5-89ed-5333-8111-ad25a28bee8b}")
@Guid("d9876ff589ed53338111ad25a28bee8b")
@WinRTInterface("d9876ff589ed53338111ad25a28bee8b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITransformPattern2IdentifiersStatics.ByReference::class)
public interface ITransformPattern2IdentifiersStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CanZoomProperty(): AutomationProperty?

  @InterfaceMethod(1)
  public fun get_ZoomLevelProperty(): AutomationProperty?

  @InterfaceMethod(2)
  public fun get_MaxZoomProperty(): AutomationProperty?

  @InterfaceMethod(3)
  public fun get_MinZoomProperty(): AutomationProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITransformPattern2IdentifiersStatics> {
    public override fun getValue() =
        ABI.makeITransformPattern2IdentifiersStatics(pointer.getPointer(0))

    public fun setValue(value: ITransformPattern2IdentifiersStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITransformPattern2IdentifiersStatics {
    public val __254387715_Ptr: Pointer?

    public val _254387715_VtblPtr: Pointer?
      get() = __254387715_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CanZoomProperty(): AutomationProperty? {
      val fnPtr = _254387715_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__254387715_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ZoomLevelProperty(): AutomationProperty? {
      val fnPtr = _254387715_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__254387715_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_MaxZoomProperty(): AutomationProperty? {
      val fnPtr = _254387715_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__254387715_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_MinZoomProperty(): AutomationProperty? {
      val fnPtr = _254387715_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__254387715_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }
  }

  public class ITransformPattern2IdentifiersStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __254387715_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITransformPattern2IdentifiersStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d9876ff589ed53338111ad25a28bee8b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITransformPattern2IdentifiersStatics(ptr: Pointer?): WithDefault =
        ITransformPattern2IdentifiersStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITransformPattern2IdentifiersStatics {
      val address = segment.toRawLongValue()
      return makeITransformPattern2IdentifiersStatics(Pointer(address))
    }

    public override fun toNative(obj: ITransformPattern2IdentifiersStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__254387715_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITransformPattern2IdentifiersStatics):
        Array<ITransformPattern2IdentifiersStatics?> = (elements as
        Array<ITransformPattern2IdentifiersStatics?>).castToImpl<ITransformPattern2IdentifiersStatics,ITransformPattern2IdentifiersStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITransformPattern2IdentifiersStatics?> =
        arrayOfNulls<ITransformPattern2IdentifiersStatics_Impl>(size) as
        Array<ITransformPattern2IdentifiersStatics?>
  }
}

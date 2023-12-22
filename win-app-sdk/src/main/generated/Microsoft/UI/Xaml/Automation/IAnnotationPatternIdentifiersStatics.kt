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

@ABIMarker(IAnnotationPatternIdentifiersStatics.ABI::class)
@Signature("{20a136e2-4a47-5de5-9e1e-ecfc6d92f52a}")
@Guid("20a136e24a475de59e1eecfc6d92f52a")
@WinRTInterface("20a136e24a475de59e1eecfc6d92f52a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAnnotationPatternIdentifiersStatics.ByReference::class)
public interface IAnnotationPatternIdentifiersStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AnnotationTypeIdProperty(): AutomationProperty?

  @InterfaceMethod(1)
  public fun get_AnnotationTypeNameProperty(): AutomationProperty?

  @InterfaceMethod(2)
  public fun get_AuthorProperty(): AutomationProperty?

  @InterfaceMethod(3)
  public fun get_DateTimeProperty(): AutomationProperty?

  @InterfaceMethod(4)
  public fun get_TargetProperty(): AutomationProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAnnotationPatternIdentifiersStatics> {
    public override fun getValue() =
        ABI.makeIAnnotationPatternIdentifiersStatics(pointer.getPointer(0))

    public fun setValue(value: IAnnotationPatternIdentifiersStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAnnotationPatternIdentifiersStatics {
    public val __214411894_Ptr: Pointer?

    public val _214411894_VtblPtr: Pointer?
      get() = __214411894_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AnnotationTypeIdProperty(): AutomationProperty? {
      val fnPtr = _214411894_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__214411894_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AnnotationTypeNameProperty(): AutomationProperty? {
      val fnPtr = _214411894_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__214411894_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_AuthorProperty(): AutomationProperty? {
      val fnPtr = _214411894_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__214411894_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_DateTimeProperty(): AutomationProperty? {
      val fnPtr = _214411894_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__214411894_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_TargetProperty(): AutomationProperty? {
      val fnPtr = _214411894_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__214411894_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }
  }

  public class IAnnotationPatternIdentifiersStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __214411894_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAnnotationPatternIdentifiersStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("20a136e24a475de59e1eecfc6d92f52a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAnnotationPatternIdentifiersStatics(ptr: Pointer?): WithDefault =
        IAnnotationPatternIdentifiersStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAnnotationPatternIdentifiersStatics {
      val address = segment.toRawLongValue()
      return makeIAnnotationPatternIdentifiersStatics(Pointer(address))
    }

    public override fun toNative(obj: IAnnotationPatternIdentifiersStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__214411894_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAnnotationPatternIdentifiersStatics):
        Array<IAnnotationPatternIdentifiersStatics?> = (elements as
        Array<IAnnotationPatternIdentifiersStatics?>).castToImpl<IAnnotationPatternIdentifiersStatics,IAnnotationPatternIdentifiersStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAnnotationPatternIdentifiersStatics?> =
        arrayOfNulls<IAnnotationPatternIdentifiersStatics_Impl>(size) as
        Array<IAnnotationPatternIdentifiersStatics?>
  }
}

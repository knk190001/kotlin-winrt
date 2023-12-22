package Windows.UI.Xaml.Automation

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

@ABIMarker(ITransformPatternIdentifiersStatics.ABI::class)
@Signature("{4570edab-d705-40c4-a1dc-e9acfcef85f6}")
@Guid("4570edabd70540c4a1dce9acfcef85f6")
@WinRTInterface("4570edabd70540c4a1dce9acfcef85f6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITransformPatternIdentifiersStatics.ByReference::class)
public interface ITransformPatternIdentifiersStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CanMoveProperty(): AutomationProperty?

  @InterfaceMethod(1)
  public fun get_CanResizeProperty(): AutomationProperty?

  @InterfaceMethod(2)
  public fun get_CanRotateProperty(): AutomationProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITransformPatternIdentifiersStatics> {
    public override fun getValue() =
        ABI.makeITransformPatternIdentifiersStatics(pointer.getPointer(0))

    public fun setValue(value: ITransformPatternIdentifiersStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITransformPatternIdentifiersStatics {
    public val __1337420282_Ptr: Pointer?

    public val _1337420282_VtblPtr: Pointer?
      get() = __1337420282_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CanMoveProperty(): AutomationProperty? {
      val fnPtr = _1337420282_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__1337420282_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CanResizeProperty(): AutomationProperty? {
      val fnPtr = _1337420282_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__1337420282_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_CanRotateProperty(): AutomationProperty? {
      val fnPtr = _1337420282_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationProperty>()
      val hr = fn.invokeHR(arrayOf(__1337420282_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationProperty>(result.getValue())
      return resultValue
    }
  }

  public class ITransformPatternIdentifiersStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1337420282_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITransformPatternIdentifiersStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4570edabd70540c4a1dce9acfcef85f6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITransformPatternIdentifiersStatics(ptr: Pointer?): WithDefault =
        ITransformPatternIdentifiersStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITransformPatternIdentifiersStatics {
      val address = segment.toRawLongValue()
      return makeITransformPatternIdentifiersStatics(Pointer(address))
    }

    public override fun toNative(obj: ITransformPatternIdentifiersStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1337420282_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITransformPatternIdentifiersStatics):
        Array<ITransformPatternIdentifiersStatics?> = (elements as
        Array<ITransformPatternIdentifiersStatics?>).castToImpl<ITransformPatternIdentifiersStatics,ITransformPatternIdentifiersStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITransformPatternIdentifiersStatics?> =
        arrayOfNulls<ITransformPatternIdentifiersStatics_Impl>(size) as
        Array<ITransformPatternIdentifiersStatics?>
  }
}

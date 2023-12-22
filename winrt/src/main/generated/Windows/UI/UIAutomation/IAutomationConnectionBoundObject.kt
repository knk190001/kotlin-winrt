package Windows.UI.UIAutomation

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

@ABIMarker(IAutomationConnectionBoundObject.ABI::class)
@Signature("{5e8558fb-ca52-5b65-9830-dd2905816093}")
@Guid("5e8558fbca525b659830dd2905816093")
@WinRTInterface("5e8558fbca525b659830dd2905816093")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationConnectionBoundObject.ByReference::class)
public interface IAutomationConnectionBoundObject : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Connection(): AutomationConnection?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationConnectionBoundObject> {
    public override fun getValue() = ABI.makeIAutomationConnectionBoundObject(pointer.getPointer(0))

    public fun setValue(value: IAutomationConnectionBoundObject_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationConnectionBoundObject {
    public val __1883627367_Ptr: Pointer?

    public val _1883627367_VtblPtr: Pointer?
      get() = __1883627367_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Connection(): AutomationConnection? {
      val fnPtr = _1883627367_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutomationConnection>()
      val hr = fn.invokeHR(arrayOf(__1883627367_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutomationConnection>(result.getValue())
      return resultValue
    }
  }

  public class IAutomationConnectionBoundObject_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1883627367_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationConnectionBoundObject, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5e8558fbca525b659830dd2905816093")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationConnectionBoundObject(ptr: Pointer?): WithDefault =
        IAutomationConnectionBoundObject_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationConnectionBoundObject {
      val address = segment.toRawLongValue()
      return makeIAutomationConnectionBoundObject(Pointer(address))
    }

    public override fun toNative(obj: IAutomationConnectionBoundObject): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1883627367_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationConnectionBoundObject):
        Array<IAutomationConnectionBoundObject?> = (elements as
        Array<IAutomationConnectionBoundObject?>).castToImpl<IAutomationConnectionBoundObject,IAutomationConnectionBoundObject_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationConnectionBoundObject?> =
        arrayOfNulls<IAutomationConnectionBoundObject_Impl>(size) as
        Array<IAutomationConnectionBoundObject?>
  }
}

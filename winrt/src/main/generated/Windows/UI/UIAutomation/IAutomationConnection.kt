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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAutomationConnection.ABI::class)
@Signature("{aad262ed-0ef4-5d43-97be-a834e27b65b9}")
@Guid("aad262ed0ef45d4397bea834e27b65b9")
@WinRTInterface("aad262ed0ef45d4397bea834e27b65b9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationConnection.ByReference::class)
public interface IAutomationConnection : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsRemoteSystem(): Boolean

  @InterfaceMethod(1)
  public fun get_AppUserModelId(): String?

  @InterfaceMethod(2)
  public fun get_ExecutableFileName(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationConnection> {
    public override fun getValue() = ABI.makeIAutomationConnection(pointer.getPointer(0))

    public fun setValue(value: IAutomationConnection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationConnection {
    public val __994239708_Ptr: Pointer?

    public val _994239708_VtblPtr: Pointer?
      get() = __994239708_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsRemoteSystem(): Boolean {
      val fnPtr = _994239708_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__994239708_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_AppUserModelId(): String? {
      val fnPtr = _994239708_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__994239708_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ExecutableFileName(): String? {
      val fnPtr = _994239708_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__994239708_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IAutomationConnection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __994239708_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationConnection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aad262ed0ef45d4397bea834e27b65b9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationConnection(ptr: Pointer?): WithDefault =
        IAutomationConnection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationConnection {
      val address = segment.toRawLongValue()
      return makeIAutomationConnection(Pointer(address))
    }

    public override fun toNative(obj: IAutomationConnection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__994239708_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationConnection): Array<IAutomationConnection?> =
        (elements as
        Array<IAutomationConnection?>).castToImpl<IAutomationConnection,IAutomationConnection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationConnection?> =
        arrayOfNulls<IAutomationConnection_Impl>(size) as Array<IAutomationConnection?>
  }
}

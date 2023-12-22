package Windows.UI.Xaml.Automation.Peers

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

@ABIMarker(IAutomationPeer5.ABI::class)
@Signature("{f632e1c6-0a3f-4574-9fef-cdc151765674}")
@Guid("f632e1c60a3f45749fefcdc151765674")
@WinRTInterface("f632e1c60a3f45749fefcdc151765674")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationPeer5.ByReference::class)
public interface IAutomationPeer5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsPeripheral(): Boolean

  @InterfaceMethod(1)
  public fun IsDataValidForForm(): Boolean

  @InterfaceMethod(2)
  public fun GetFullDescription(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationPeer5> {
    public override fun getValue() = ABI.makeIAutomationPeer5(pointer.getPointer(0))

    public fun setValue(value: IAutomationPeer5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationPeer5 {
    public val __1075421564_Ptr: Pointer?

    public val _1075421564_VtblPtr: Pointer?
      get() = __1075421564_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsPeripheral(): Boolean {
      val fnPtr = _1075421564_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1075421564_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun IsDataValidForForm(): Boolean {
      val fnPtr = _1075421564_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1075421564_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun GetFullDescription(): String? {
      val fnPtr = _1075421564_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1075421564_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IAutomationPeer5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1075421564_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationPeer5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f632e1c60a3f45749fefcdc151765674")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationPeer5(ptr: Pointer?): WithDefault = IAutomationPeer5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationPeer5 {
      val address = segment.toRawLongValue()
      return makeIAutomationPeer5(Pointer(address))
    }

    public override fun toNative(obj: IAutomationPeer5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1075421564_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationPeer5): Array<IAutomationPeer5?> = (elements as
        Array<IAutomationPeer5?>).castToImpl<IAutomationPeer5,IAutomationPeer5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationPeer5?> =
        arrayOfNulls<IAutomationPeer5_Impl>(size) as Array<IAutomationPeer5?>
  }
}

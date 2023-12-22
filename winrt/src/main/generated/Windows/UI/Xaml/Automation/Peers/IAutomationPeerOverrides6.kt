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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAutomationPeerOverrides6.ABI::class)
@Signature("{e98babe7-f6ff-444c-9c0d-277eaf0ad9c0}")
@Guid("e98babe7f6ff444c9c0d277eaf0ad9c0")
@WinRTInterface("e98babe7f6ff444c9c0d277eaf0ad9c0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutomationPeerOverrides6.ByReference::class)
public interface IAutomationPeerOverrides6 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetCultureCore(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutomationPeerOverrides6> {
    public override fun getValue() = ABI.makeIAutomationPeerOverrides6(pointer.getPointer(0))

    public fun setValue(value: IAutomationPeerOverrides6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutomationPeerOverrides6 {
    public val __706645408_Ptr: Pointer?

    public val _706645408_VtblPtr: Pointer?
      get() = __706645408_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetCultureCore(): Int {
      val fnPtr = _706645408_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__706645408_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IAutomationPeerOverrides6_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __706645408_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutomationPeerOverrides6, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e98babe7f6ff444c9c0d277eaf0ad9c0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutomationPeerOverrides6(ptr: Pointer?): WithDefault =
        IAutomationPeerOverrides6_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutomationPeerOverrides6 {
      val address = segment.toRawLongValue()
      return makeIAutomationPeerOverrides6(Pointer(address))
    }

    public override fun toNative(obj: IAutomationPeerOverrides6): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__706645408_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutomationPeerOverrides6):
        Array<IAutomationPeerOverrides6?> = (elements as
        Array<IAutomationPeerOverrides6?>).castToImpl<IAutomationPeerOverrides6,IAutomationPeerOverrides6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutomationPeerOverrides6?> =
        arrayOfNulls<IAutomationPeerOverrides6_Impl>(size) as Array<IAutomationPeerOverrides6?>
  }
}

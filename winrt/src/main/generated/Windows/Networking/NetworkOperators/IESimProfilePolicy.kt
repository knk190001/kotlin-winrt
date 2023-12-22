package Windows.Networking.NetworkOperators

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IESimProfilePolicy.ABI::class)
@Signature("{e6dd0f1d-9c5c-46c5-a289-a948999bf062}")
@Guid("e6dd0f1d9c5c46c5a289a948999bf062")
@WinRTInterface("e6dd0f1d9c5c46c5a289a948999bf062")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IESimProfilePolicy.ByReference::class)
public interface IESimProfilePolicy : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CanDelete(): Boolean

  @InterfaceMethod(1)
  public fun get_CanDisable(): Boolean

  @InterfaceMethod(2)
  public fun get_IsManagedByEnterprise(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IESimProfilePolicy> {
    public override fun getValue() = ABI.makeIESimProfilePolicy(pointer.getPointer(0))

    public fun setValue(value: IESimProfilePolicy_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IESimProfilePolicy {
    public val __1833780656_Ptr: Pointer?

    public val _1833780656_VtblPtr: Pointer?
      get() = __1833780656_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CanDelete(): Boolean {
      val fnPtr = _1833780656_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1833780656_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_CanDisable(): Boolean {
      val fnPtr = _1833780656_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1833780656_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_IsManagedByEnterprise(): Boolean {
      val fnPtr = _1833780656_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1833780656_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IESimProfilePolicy_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1833780656_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IESimProfilePolicy, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e6dd0f1d9c5c46c5a289a948999bf062")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIESimProfilePolicy(ptr: Pointer?): WithDefault = IESimProfilePolicy_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IESimProfilePolicy {
      val address = segment.toRawLongValue()
      return makeIESimProfilePolicy(Pointer(address))
    }

    public override fun toNative(obj: IESimProfilePolicy): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1833780656_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IESimProfilePolicy): Array<IESimProfilePolicy?> =
        (elements as
        Array<IESimProfilePolicy?>).castToImpl<IESimProfilePolicy,IESimProfilePolicy_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IESimProfilePolicy?> =
        arrayOfNulls<IESimProfilePolicy_Impl>(size) as Array<IESimProfilePolicy?>
  }
}

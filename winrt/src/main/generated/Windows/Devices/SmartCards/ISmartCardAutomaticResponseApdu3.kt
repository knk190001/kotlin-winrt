package Windows.Devices.SmartCards

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

@ABIMarker(ISmartCardAutomaticResponseApdu3.ABI::class)
@Signature("{bf43da74-6576-4392-9367-fe3bc9e2d496}")
@Guid("bf43da74657643929367fe3bc9e2d496")
@WinRTInterface("bf43da74657643929367fe3bc9e2d496")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmartCardAutomaticResponseApdu3.ByReference::class)
public interface ISmartCardAutomaticResponseApdu3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AllowWhenCryptogramGeneratorNotPrepared(): Boolean

  @InterfaceMethod(1)
  public fun put_AllowWhenCryptogramGeneratorNotPrepared(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardAutomaticResponseApdu3> {
    public override fun getValue() = ABI.makeISmartCardAutomaticResponseApdu3(pointer.getPointer(0))

    public fun setValue(value: ISmartCardAutomaticResponseApdu3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardAutomaticResponseApdu3 {
    public val __467876813_Ptr: Pointer?

    public val _467876813_VtblPtr: Pointer?
      get() = __467876813_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AllowWhenCryptogramGeneratorNotPrepared(): Boolean {
      val fnPtr = _467876813_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__467876813_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_AllowWhenCryptogramGeneratorNotPrepared(value: Boolean): Unit {
      val fnPtr = _467876813_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__467876813_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISmartCardAutomaticResponseApdu3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __467876813_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardAutomaticResponseApdu3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bf43da74657643929367fe3bc9e2d496")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardAutomaticResponseApdu3(ptr: Pointer?): WithDefault =
        ISmartCardAutomaticResponseApdu3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmartCardAutomaticResponseApdu3 {
      val address = segment.toRawLongValue()
      return makeISmartCardAutomaticResponseApdu3(Pointer(address))
    }

    public override fun toNative(obj: ISmartCardAutomaticResponseApdu3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__467876813_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCardAutomaticResponseApdu3):
        Array<ISmartCardAutomaticResponseApdu3?> = (elements as
        Array<ISmartCardAutomaticResponseApdu3?>).castToImpl<ISmartCardAutomaticResponseApdu3,ISmartCardAutomaticResponseApdu3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmartCardAutomaticResponseApdu3?> =
        arrayOfNulls<ISmartCardAutomaticResponseApdu3_Impl>(size) as
        Array<ISmartCardAutomaticResponseApdu3?>
  }
}

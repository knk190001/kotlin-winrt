package Windows.ApplicationModel.Store.LicenseManagement

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

@ABIMarker(ILicenseSatisfactionInfo.ABI::class)
@Signature("{3ccbb08f-db31-48d5-8384-fa17c81474e2}")
@Guid("3ccbb08fdb3148d58384fa17c81474e2")
@WinRTInterface("3ccbb08fdb3148d58384fa17c81474e2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILicenseSatisfactionInfo.ByReference::class)
public interface ILicenseSatisfactionInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SatisfiedByDevice(): Boolean

  @InterfaceMethod(1)
  public fun get_SatisfiedByOpenLicense(): Boolean

  @InterfaceMethod(2)
  public fun get_SatisfiedByTrial(): Boolean

  @InterfaceMethod(3)
  public fun get_SatisfiedByPass(): Boolean

  @InterfaceMethod(4)
  public fun get_SatisfiedByInstallMedia(): Boolean

  @InterfaceMethod(5)
  public fun get_SatisfiedBySignedInUser(): Boolean

  @InterfaceMethod(6)
  public fun get_IsSatisfied(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILicenseSatisfactionInfo> {
    public override fun getValue() = ABI.makeILicenseSatisfactionInfo(pointer.getPointer(0))

    public fun setValue(value: ILicenseSatisfactionInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILicenseSatisfactionInfo {
    public val __635336607_Ptr: Pointer?

    public val _635336607_VtblPtr: Pointer?
      get() = __635336607_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SatisfiedByDevice(): Boolean {
      val fnPtr = _635336607_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__635336607_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_SatisfiedByOpenLicense(): Boolean {
      val fnPtr = _635336607_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__635336607_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_SatisfiedByTrial(): Boolean {
      val fnPtr = _635336607_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__635336607_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_SatisfiedByPass(): Boolean {
      val fnPtr = _635336607_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__635336607_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_SatisfiedByInstallMedia(): Boolean {
      val fnPtr = _635336607_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__635336607_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_SatisfiedBySignedInUser(): Boolean {
      val fnPtr = _635336607_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__635336607_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_IsSatisfied(): Boolean {
      val fnPtr = _635336607_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__635336607_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ILicenseSatisfactionInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __635336607_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILicenseSatisfactionInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3ccbb08fdb3148d58384fa17c81474e2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILicenseSatisfactionInfo(ptr: Pointer?): WithDefault =
        ILicenseSatisfactionInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILicenseSatisfactionInfo {
      val address = segment.toRawLongValue()
      return makeILicenseSatisfactionInfo(Pointer(address))
    }

    public override fun toNative(obj: ILicenseSatisfactionInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__635336607_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILicenseSatisfactionInfo):
        Array<ILicenseSatisfactionInfo?> = (elements as
        Array<ILicenseSatisfactionInfo?>).castToImpl<ILicenseSatisfactionInfo,ILicenseSatisfactionInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILicenseSatisfactionInfo?> =
        arrayOfNulls<ILicenseSatisfactionInfo_Impl>(size) as Array<ILicenseSatisfactionInfo?>
  }
}

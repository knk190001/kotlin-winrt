package Windows.Media.Protection.PlayReady

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
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(INDLicenseFetchDescriptor.ABI::class)
@Signature("{5498d33a-e686-4935-a567-7ca77ad20fa4}")
@Guid("5498d33ae6864935a5677ca77ad20fa4")
@WinRTInterface("5498d33ae6864935a5677ca77ad20fa4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INDLicenseFetchDescriptor.ByReference::class)
public interface INDLicenseFetchDescriptor : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContentIDType(): NDContentIDType?

  @InterfaceMethod(1)
  public fun get_ContentID(): Array<Byte>?

  @InterfaceMethod(2)
  public fun get_LicenseFetchChallengeCustomData(): INDCustomData?

  @InterfaceMethod(3)
  public fun put_LicenseFetchChallengeCustomData(licenseFetchChallengeCustomData: INDCustomData?):
      Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INDLicenseFetchDescriptor> {
    public override fun getValue() = ABI.makeINDLicenseFetchDescriptor(pointer.getPointer(0))

    public fun setValue(value: INDLicenseFetchDescriptor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INDLicenseFetchDescriptor {
    public val __986948488_Ptr: Pointer?

    public val _986948488_VtblPtr: Pointer?
      get() = __986948488_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContentIDType(): NDContentIDType? {
      val fnPtr = _986948488_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NDContentIDType>()
      val hr = fn.invokeHR(arrayOf(__986948488_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NDContentIDType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ContentID(): Array<Byte>? {
      val fnPtr = _986948488_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makePrimitiveOutArray<Byte>()
      val hr = fn.invokeHR(arrayOf(__986948488_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_LicenseFetchChallengeCustomData(): INDCustomData? {
      val fnPtr = _986948488_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<INDCustomData>()
      val hr = fn.invokeHR(arrayOf(__986948488_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<INDCustomData>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override
        fun put_LicenseFetchChallengeCustomData(licenseFetchChallengeCustomData: INDCustomData?):
        Unit {
      val fnPtr = _986948488_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__986948488_Ptr,
          marshalToNative(licenseFetchChallengeCustomData),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class INDLicenseFetchDescriptor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __986948488_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INDLicenseFetchDescriptor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5498d33ae6864935a5677ca77ad20fa4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINDLicenseFetchDescriptor(ptr: Pointer?): WithDefault =
        INDLicenseFetchDescriptor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INDLicenseFetchDescriptor {
      val address = segment.toRawLongValue()
      return makeINDLicenseFetchDescriptor(Pointer(address))
    }

    public override fun toNative(obj: INDLicenseFetchDescriptor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__986948488_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INDLicenseFetchDescriptor):
        Array<INDLicenseFetchDescriptor?> = (elements as
        Array<INDLicenseFetchDescriptor?>).castToImpl<INDLicenseFetchDescriptor,INDLicenseFetchDescriptor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INDLicenseFetchDescriptor?> =
        arrayOfNulls<INDLicenseFetchDescriptor_Impl>(size) as Array<INDLicenseFetchDescriptor?>
  }
}

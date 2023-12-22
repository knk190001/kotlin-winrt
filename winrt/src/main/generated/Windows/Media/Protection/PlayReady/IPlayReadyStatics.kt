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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IPlayReadyStatics.ABI::class)
@Signature("{5e69c00d-247c-469a-8f31-5c1a1571d9c6}")
@Guid("5e69c00d247c469a8f315c1a1571d9c6")
@WinRTInterface("5e69c00d247c469a8f315c1a1571d9c6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlayReadyStatics.ByReference::class)
public interface IPlayReadyStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DomainJoinServiceRequestType(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_DomainLeaveServiceRequestType(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(2)
  public fun get_IndividualizationServiceRequestType(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(3)
  public fun get_LicenseAcquirerServiceRequestType(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(4)
  public fun get_MeteringReportServiceRequestType(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(5)
  public fun get_RevocationServiceRequestType(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(6)
  public fun get_MediaProtectionSystemId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(7)
  public fun get_PlayReadySecurityVersion(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlayReadyStatics> {
    public override fun getValue() = ABI.makeIPlayReadyStatics(pointer.getPointer(0))

    public fun setValue(value: IPlayReadyStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlayReadyStatics {
    public val __1505496080_Ptr: Pointer?

    public val _1505496080_VtblPtr: Pointer?
      get() = __1505496080_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DomainJoinServiceRequestType(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1505496080_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1505496080_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DomainLeaveServiceRequestType(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1505496080_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1505496080_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IndividualizationServiceRequestType():
        com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1505496080_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1505496080_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_LicenseAcquirerServiceRequestType():
        com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1505496080_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1505496080_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_MeteringReportServiceRequestType():
        com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1505496080_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1505496080_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_RevocationServiceRequestType(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1505496080_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1505496080_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_MediaProtectionSystemId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1505496080_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1505496080_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_PlayReadySecurityVersion(): WinDef.UINT {
      val fnPtr = _1505496080_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1505496080_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IPlayReadyStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1505496080_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlayReadyStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5e69c00d247c469a8f315c1a1571d9c6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlayReadyStatics(ptr: Pointer?): WithDefault = IPlayReadyStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlayReadyStatics {
      val address = segment.toRawLongValue()
      return makeIPlayReadyStatics(Pointer(address))
    }

    public override fun toNative(obj: IPlayReadyStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1505496080_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlayReadyStatics): Array<IPlayReadyStatics?> = (elements
        as Array<IPlayReadyStatics?>).castToImpl<IPlayReadyStatics,IPlayReadyStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlayReadyStatics?> =
        arrayOfNulls<IPlayReadyStatics_Impl>(size) as Array<IPlayReadyStatics?>
  }
}

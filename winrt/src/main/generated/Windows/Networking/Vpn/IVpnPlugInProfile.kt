package Windows.Networking.Vpn

import Windows.Foundation.Collections.IVector
import Windows.Foundation.Uri
import Windows.Networking.Vpn.IVpnProfile.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVpnPlugInProfile.ABI::class)
@Signature("{0edf0da4-4f00-4589-8d7b-4bf988f6542c}")
@Guid("0edf0da44f0045898d7b4bf988f6542c")
@WinRTInterface("0edf0da44f0045898d7b4bf988f6542c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnPlugInProfile.ByReference::class)
public interface IVpnPlugInProfile : NativeMapped, IWinRTInterface, IVpnProfile {
  @InterfaceMethod(0)
  public fun get_ServerUris(): IVector<Uri?>?

  @InterfaceMethod(1)
  public fun get_CustomConfiguration(): String?

  @InterfaceMethod(2)
  public fun put_CustomConfiguration(value: String?): Unit

  @InterfaceMethod(3)
  public fun get_VpnPluginPackageFamilyName(): String?

  @InterfaceMethod(4)
  public fun put_VpnPluginPackageFamilyName(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVpnPlugInProfile> {
    public override fun getValue() = ABI.makeIVpnPlugInProfile(pointer.getPointer(0))

    public fun setValue(value: IVpnPlugInProfile_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnPlugInProfile, IVpnProfile.WithDefault {
    public val __1317719706_Ptr: Pointer?

    public val _1317719706_VtblPtr: Pointer?
      get() = __1317719706_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ServerUris(): IVector<Uri?>? {
      val fnPtr = _1317719706_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Uri?>>()
      val hr = fn.invokeHR(arrayOf(__1317719706_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Uri?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CustomConfiguration(): String? {
      val fnPtr = _1317719706_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1317719706_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_CustomConfiguration(value: String?): Unit {
      val fnPtr = _1317719706_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1317719706_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_VpnPluginPackageFamilyName(): String? {
      val fnPtr = _1317719706_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1317719706_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_VpnPluginPackageFamilyName(value: String?): Unit {
      val fnPtr = _1317719706_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1317719706_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVpnPlugInProfile_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IVpnProfile {
    public override val __1256391737_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1317719706_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1317719706_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnPlugInProfile, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0edf0da44f0045898d7b4bf988f6542c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnPlugInProfile(ptr: Pointer?): WithDefault = IVpnPlugInProfile_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnPlugInProfile {
      val address = segment.toRawLongValue()
      return makeIVpnPlugInProfile(Pointer(address))
    }

    public override fun toNative(obj: IVpnPlugInProfile): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1317719706_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnPlugInProfile): Array<IVpnPlugInProfile?> = (elements
        as Array<IVpnPlugInProfile?>).castToImpl<IVpnPlugInProfile,IVpnPlugInProfile_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnPlugInProfile?> =
        arrayOfNulls<IVpnPlugInProfile_Impl>(size) as Array<IVpnPlugInProfile?>
  }
}

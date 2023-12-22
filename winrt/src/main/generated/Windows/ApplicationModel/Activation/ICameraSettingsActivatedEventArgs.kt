package Windows.ApplicationModel.Activation

import Windows.ApplicationModel.Activation.IActivatedEventArgs.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICameraSettingsActivatedEventArgs.ABI::class)
@Signature("{fb67a508-2dad-490a-9170-dca036eb114b}")
@Guid("fb67a5082dad490a9170dca036eb114b")
@WinRTInterface("fb67a5082dad490a9170dca036eb114b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICameraSettingsActivatedEventArgs.ByReference::class)
public interface ICameraSettingsActivatedEventArgs : NativeMapped, IWinRTInterface,
    IActivatedEventArgs {
  @InterfaceMethod(0)
  public fun get_VideoDeviceController(): IUnknown?

  @InterfaceMethod(1)
  public fun get_VideoDeviceExtension(): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICameraSettingsActivatedEventArgs> {
    public override fun getValue() =
        ABI.makeICameraSettingsActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICameraSettingsActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICameraSettingsActivatedEventArgs, IActivatedEventArgs.WithDefault
      {
    public val __1249263447_Ptr: Pointer?

    public val _1249263447_VtblPtr: Pointer?
      get() = __1249263447_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_VideoDeviceController(): IUnknown? {
      val fnPtr = _1249263447_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1249263447_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_VideoDeviceExtension(): IUnknown? {
      val fnPtr = _1249263447_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1249263447_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class ICameraSettingsActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IActivatedEventArgs {
    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1249263447_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1249263447_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICameraSettingsActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fb67a5082dad490a9170dca036eb114b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICameraSettingsActivatedEventArgs(ptr: Pointer?): WithDefault =
        ICameraSettingsActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICameraSettingsActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeICameraSettingsActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICameraSettingsActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1249263447_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICameraSettingsActivatedEventArgs):
        Array<ICameraSettingsActivatedEventArgs?> = (elements as
        Array<ICameraSettingsActivatedEventArgs?>).castToImpl<ICameraSettingsActivatedEventArgs,ICameraSettingsActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICameraSettingsActivatedEventArgs?> =
        arrayOfNulls<ICameraSettingsActivatedEventArgs_Impl>(size) as
        Array<ICameraSettingsActivatedEventArgs?>
  }
}

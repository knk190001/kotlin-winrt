package Windows.Media

import Windows.ApplicationModel.AppService.AppServiceConnection
import Windows.Media.IMediaExtensionManager.ABI.IID
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaExtensionManager2.ABI::class)
@Signature("{5bcebf47-4043-4fed-acaf-54ec29dfb1f7}")
@Guid("5bcebf4740434fedacaf54ec29dfb1f7")
@WinRTInterface("5bcebf4740434fedacaf54ec29dfb1f7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaExtensionManager2.ByReference::class)
public interface IMediaExtensionManager2 : NativeMapped, IWinRTInterface, IMediaExtensionManager {
  @InterfaceMethod(0)
  public fun RegisterMediaExtensionForAppService(extension: IMediaExtension?,
      connection: AppServiceConnection?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaExtensionManager2> {
    public override fun getValue() = ABI.makeIMediaExtensionManager2(pointer.getPointer(0))

    public fun setValue(value: IMediaExtensionManager2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaExtensionManager2, IMediaExtensionManager.WithDefault {
    public val __100097264_Ptr: Pointer?

    public val _100097264_VtblPtr: Pointer?
      get() = __100097264_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RegisterMediaExtensionForAppService(extension: IMediaExtension?,
        connection: AppServiceConnection?): Unit {
      val fnPtr = _100097264_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__100097264_Ptr, marshalToNative(extension),
          marshalToNative(connection),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaExtensionManager2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMediaExtensionManager {
    public override val __418870942_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_100097264_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __100097264_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaExtensionManager2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5bcebf4740434fedacaf54ec29dfb1f7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaExtensionManager2(ptr: Pointer?): WithDefault =
        IMediaExtensionManager2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaExtensionManager2 {
      val address = segment.toRawLongValue()
      return makeIMediaExtensionManager2(Pointer(address))
    }

    public override fun toNative(obj: IMediaExtensionManager2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__100097264_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaExtensionManager2): Array<IMediaExtensionManager2?>
        = (elements as
        Array<IMediaExtensionManager2?>).castToImpl<IMediaExtensionManager2,IMediaExtensionManager2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaExtensionManager2?> =
        arrayOfNulls<IMediaExtensionManager2_Impl>(size) as Array<IMediaExtensionManager2?>
  }
}

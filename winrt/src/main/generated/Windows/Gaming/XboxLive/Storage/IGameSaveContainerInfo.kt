package Windows.Gaming.XboxLive.Storage

import Windows.Foundation.DateTime
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGameSaveContainerInfo.ABI::class)
@Signature("{b7e27300-155d-4bb4-b2ba-930306f391b5}")
@Guid("b7e27300155d4bb4b2ba930306f391b5")
@WinRTInterface("b7e27300155d4bb4b2ba930306f391b5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGameSaveContainerInfo.ByReference::class)
public interface IGameSaveContainerInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun get_TotalSize(): WinDef.ULONG

  @InterfaceMethod(2)
  public fun get_DisplayName(): String?

  @InterfaceMethod(3)
  public fun get_LastModifiedTime(): DateTime?

  @InterfaceMethod(4)
  public fun get_NeedsSync(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGameSaveContainerInfo> {
    public override fun getValue() = ABI.makeIGameSaveContainerInfo(pointer.getPointer(0))

    public fun setValue(value: IGameSaveContainerInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGameSaveContainerInfo {
    public val __232502697_Ptr: Pointer?

    public val _232502697_VtblPtr: Pointer?
      get() = __232502697_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _232502697_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__232502697_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TotalSize(): WinDef.ULONG {
      val fnPtr = _232502697_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__232502697_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_DisplayName(): String? {
      val fnPtr = _232502697_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__232502697_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_LastModifiedTime(): DateTime? {
      val fnPtr = _232502697_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__232502697_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_NeedsSync(): Boolean {
      val fnPtr = _232502697_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__232502697_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IGameSaveContainerInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __232502697_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGameSaveContainerInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b7e27300155d4bb4b2ba930306f391b5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGameSaveContainerInfo(ptr: Pointer?): WithDefault =
        IGameSaveContainerInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGameSaveContainerInfo {
      val address = segment.toRawLongValue()
      return makeIGameSaveContainerInfo(Pointer(address))
    }

    public override fun toNative(obj: IGameSaveContainerInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__232502697_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGameSaveContainerInfo): Array<IGameSaveContainerInfo?> =
        (elements as
        Array<IGameSaveContainerInfo?>).castToImpl<IGameSaveContainerInfo,IGameSaveContainerInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGameSaveContainerInfo?> =
        arrayOfNulls<IGameSaveContainerInfo_Impl>(size) as Array<IGameSaveContainerInfo?>
  }
}

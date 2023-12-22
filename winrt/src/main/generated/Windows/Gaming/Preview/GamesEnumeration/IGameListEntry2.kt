package Windows.Gaming.Preview.GamesEnumeration

import Windows.Foundation.IAsyncAction
import Windows.Gaming.Preview.GamesEnumeration.IGameListEntry.ABI.IID
import Windows.Storage.IStorageFile
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

@ABIMarker(IGameListEntry2.ABI::class)
@Signature("{d84a8f8b-8749-4a25-90d3-f6c5a427886d}")
@Guid("d84a8f8b87494a2590d3f6c5a427886d")
@WinRTInterface("d84a8f8b87494a2590d3f6c5a427886d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGameListEntry2.ByReference::class)
public interface IGameListEntry2 : NativeMapped, IWinRTInterface, IGameListEntry {
  @InterfaceMethod(0)
  public fun get_LaunchableState(): GameListEntryLaunchableState?

  @InterfaceMethod(1)
  public fun get_LauncherExecutable(): IStorageFile?

  @InterfaceMethod(2)
  public fun get_LaunchParameters(): String?

  @InterfaceMethod(3)
  public fun SetLauncherExecutableFileAsync(executableFile: IStorageFile?): IAsyncAction?

  @InterfaceMethod(4)
  public fun SetLauncherExecutableFileAsync(executableFile: IStorageFile?, launchParams: String?):
      IAsyncAction?

  @InterfaceMethod(5)
  public fun get_TitleId(): String?

  @InterfaceMethod(6)
  public fun SetTitleIdAsync(id: String?): IAsyncAction?

  @InterfaceMethod(7)
  public fun get_GameModeConfiguration(): GameModeConfiguration?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGameListEntry2> {
    public override fun getValue() = ABI.makeIGameListEntry2(pointer.getPointer(0))

    public fun setValue(value: IGameListEntry2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGameListEntry2, IGameListEntry.WithDefault {
    public val __2090456793_Ptr: Pointer?

    public val _2090456793_VtblPtr: Pointer?
      get() = __2090456793_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LaunchableState(): GameListEntryLaunchableState? {
      val fnPtr = _2090456793_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GameListEntryLaunchableState>()
      val hr = fn.invokeHR(arrayOf(__2090456793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GameListEntryLaunchableState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_LauncherExecutable(): IStorageFile? {
      val fnPtr = _2090456793_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IStorageFile>()
      val hr = fn.invokeHR(arrayOf(__2090456793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IStorageFile>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_LaunchParameters(): String? {
      val fnPtr = _2090456793_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2090456793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun SetLauncherExecutableFileAsync(executableFile: IStorageFile?):
        IAsyncAction? {
      val fnPtr = _2090456793_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__2090456793_Ptr, marshalToNative(executableFile), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun SetLauncherExecutableFileAsync(executableFile: IStorageFile?,
        launchParams: String?): IAsyncAction? {
      val fnPtr = _2090456793_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__2090456793_Ptr, marshalToNative(executableFile),
          marshalToNative(launchParams), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_TitleId(): String? {
      val fnPtr = _2090456793_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2090456793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun SetTitleIdAsync(id: String?): IAsyncAction? {
      val fnPtr = _2090456793_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__2090456793_Ptr, marshalToNative(id), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_GameModeConfiguration(): GameModeConfiguration? {
      val fnPtr = _2090456793_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GameModeConfiguration>()
      val hr = fn.invokeHR(arrayOf(__2090456793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GameModeConfiguration>(result.getValue())
      return resultValue
    }
  }

  public class IGameListEntry2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IGameListEntry {
    public override val __621623417_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_2090456793_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2090456793_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGameListEntry2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d84a8f8b87494a2590d3f6c5a427886d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGameListEntry2(ptr: Pointer?): WithDefault = IGameListEntry2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGameListEntry2 {
      val address = segment.toRawLongValue()
      return makeIGameListEntry2(Pointer(address))
    }

    public override fun toNative(obj: IGameListEntry2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2090456793_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGameListEntry2): Array<IGameListEntry2?> = (elements as
        Array<IGameListEntry2?>).castToImpl<IGameListEntry2,IGameListEntry2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGameListEntry2?> =
        arrayOfNulls<IGameListEntry2_Impl>(size) as Array<IGameListEntry2?>
  }
}

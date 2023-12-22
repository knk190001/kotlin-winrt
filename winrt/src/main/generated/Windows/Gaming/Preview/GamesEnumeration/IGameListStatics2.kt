package Windows.Gaming.Preview.GamesEnumeration

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGameListStatics2.ABI::class)
@Signature("{395f2098-ea1a-45aa-9268-a83905686f27}")
@Guid("395f2098ea1a45aa9268a83905686f27")
@WinRTInterface("395f2098ea1a45aa9268a83905686f27")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGameListStatics2.ByReference::class)
public interface IGameListStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun MergeEntriesAsync(left: GameListEntry?, right: GameListEntry?):
      IAsyncOperation<GameListEntry?>?

  @InterfaceMethod(1)
  public fun UnmergeEntryAsync(mergedEntry: GameListEntry?):
      IAsyncOperation<IVectorView<GameListEntry?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGameListStatics2> {
    public override fun getValue() = ABI.makeIGameListStatics2(pointer.getPointer(0))

    public fun setValue(value: IGameListStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGameListStatics2 {
    public val __1998653530_Ptr: Pointer?

    public val _1998653530_VtblPtr: Pointer?
      get() = __1998653530_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun MergeEntriesAsync(left: GameListEntry?, right: GameListEntry?):
        IAsyncOperation<GameListEntry?>? {
      val fnPtr = _1998653530_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GameListEntry?>>()
      val hr = fn.invokeHR(arrayOf(__1998653530_Ptr, marshalToNative(left), marshalToNative(right),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<GameListEntry?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun UnmergeEntryAsync(mergedEntry: GameListEntry?):
        IAsyncOperation<IVectorView<GameListEntry?>?>? {
      val fnPtr = _1998653530_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<GameListEntry?>?>>()
      val hr = fn.invokeHR(arrayOf(__1998653530_Ptr, marshalToNative(mergedEntry), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<GameListEntry?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IGameListStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1998653530_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGameListStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("395f2098ea1a45aa9268a83905686f27")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGameListStatics2(ptr: Pointer?): WithDefault = IGameListStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGameListStatics2 {
      val address = segment.toRawLongValue()
      return makeIGameListStatics2(Pointer(address))
    }

    public override fun toNative(obj: IGameListStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1998653530_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGameListStatics2): Array<IGameListStatics2?> = (elements
        as Array<IGameListStatics2?>).castToImpl<IGameListStatics2,IGameListStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGameListStatics2?> =
        arrayOfNulls<IGameListStatics2_Impl>(size) as Array<IGameListStatics2?>
  }
}

package Microsoft.UI.Xaml.Data

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IObservableVector
import Windows.Foundation.Collections.IVector
import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.DynamicSignature
import com.github.knk190001.winrtbinding.runtime.annotations.GenericType
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.TypeHash
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
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
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.reflect.KType
import kotlin.reflect.KTypeProjection
import kotlin.reflect.KVariance
import kotlin.reflect.KVariance.INVARIANT
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@GenericType
@DynamicSignature
@ABIMarker(ICollectionView.ABI::class)
@Guid("f8bb90d8e0085d658c977bb790a4230c")
@WinRTByReference(ICollectionView.ByReference::class)
@TypeHash("__2102419850_Type")
public interface ICollectionView : NativeMapped, IWinRTInterface, IObservableVector<IUnknown?>,
    IVector<IUnknown?>, IIterable<IUnknown?> {
  public val __2102419850_Ptr: Pointer?

  public val _2102419850_VtblPtr: Pointer?
    get() = __2102419850_Ptr?.getPointer(0)

  public override val __1493305514_Type: KType
    get() = IObservableVector::class.createType(listOf(
      KTypeProjection(INVARIANT,IUnknown::class.createType()),
    ))

  public override val __1070388601_Type: KType
    get() = IVector::class.createType(listOf(
      KTypeProjection(INVARIANT,IUnknown::class.createType()),
    ))

  public override val __1449643190_Type: KType
    get() = IIterable::class.createType(listOf(
      KTypeProjection(INVARIANT,IUnknown::class.createType()),
    ))

  public fun get_CurrentItem(): IUnknown?

  public fun get_CurrentPosition(): Int

  public fun get_IsCurrentAfterLast(): Boolean

  public fun get_IsCurrentBeforeFirst(): Boolean

  public fun get_CollectionGroups(): IObservableVector<IUnknown?>?

  public fun get_HasMoreItems(): Boolean

  public fun add_CurrentChanged(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  public fun remove_CurrentChanged(token: EventRegistrationToken?): Unit

  public fun add_CurrentChanging(handler: CurrentChangingEventHandler?): EventRegistrationToken?

  public fun remove_CurrentChanging(token: EventRegistrationToken?): Unit

  public fun MoveCurrentTo(item: IUnknown?): Boolean

  public fun MoveCurrentToPosition(index: Int): Boolean

  public fun MoveCurrentToFirst(): Boolean

  public fun MoveCurrentToLast(): Boolean

  public fun MoveCurrentToNext(): Boolean

  public fun MoveCurrentToPrevious(): Boolean

  public fun LoadMoreItemsAsync(count: WinDef.UINT): IAsyncOperation<LoadMoreItemsResult?>?

  public interface WithDefault : ICollectionView {
    public override fun get_CurrentItem(): IUnknown? {
      val fnPtr = _2102419850_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__2102419850_Ptr,result))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val returnType = IUnknown::class.createType()
      return marshalFromNative<IUnknown>(result.getValue(), returnType!!)
    }

    public override fun get_CurrentPosition(): Int {
      val fnPtr = _2102419850_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__2102419850_Ptr,result))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val returnType = Int::class.createType()
      return marshalFromNative<Int>(result.getValue(), returnType!!)!!
    }

    public override fun get_IsCurrentAfterLast(): Boolean {
      val fnPtr = _2102419850_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2102419850_Ptr,result))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val returnType = Boolean::class.createType()
      return marshalFromNative<Boolean>(result.getValue(), returnType!!)!!
    }

    public override fun get_IsCurrentBeforeFirst(): Boolean {
      val fnPtr = _2102419850_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2102419850_Ptr,result))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val returnType = Boolean::class.createType()
      return marshalFromNative<Boolean>(result.getValue(), returnType!!)!!
    }

    public override fun get_CollectionGroups(): IObservableVector<IUnknown?>? {
      val fnPtr = _2102419850_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val result = makeByReferenceType<IObservableVector<IUnknown?>>(
      IObservableVector::class.createType(listOf(
        KTypeProjection(INVARIANT,IUnknown::class.createType()),
      )))
      val hr = fn.invokeHR(arrayOf(__2102419850_Ptr,result))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val returnType = IObservableVector::class.createType(listOf(
        KTypeProjection(INVARIANT,IUnknown::class.createType()),
      ))
      return marshalFromNative<IObservableVector<IUnknown?>>(result.getValue(), returnType!!)
    }

    public override fun get_HasMoreItems(): Boolean {
      val fnPtr = _2102419850_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2102419850_Ptr,result))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val returnType = Boolean::class.createType()
      return marshalFromNative<Boolean>(result.getValue(), returnType!!)!!
    }

    public override fun add_CurrentChanged(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _2102419850_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val result = makeByReferenceType<EventRegistrationToken.ByValue>()
      val hr = fn.invokeHR(arrayOf(__2102419850_Ptr,marshalToNative(handler),result))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val returnType = EventRegistrationToken.ByValue::class.createType()
      return marshalFromNative<EventRegistrationToken>(result.getValue(), returnType!!)
    }

    public override fun remove_CurrentChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _2102419850_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val hr = fn.invokeHR(arrayOf(__2102419850_Ptr,marshalToNative(token)))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    public override fun add_CurrentChanging(handler: CurrentChangingEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _2102419850_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val result = makeByReferenceType<EventRegistrationToken.ByValue>()
      val hr = fn.invokeHR(arrayOf(__2102419850_Ptr,marshalToNative(handler),result))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val returnType = EventRegistrationToken.ByValue::class.createType()
      return marshalFromNative<EventRegistrationToken>(result.getValue(), returnType!!)
    }

    public override fun remove_CurrentChanging(token: EventRegistrationToken?): Unit {
      val fnPtr = _2102419850_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val hr = fn.invokeHR(arrayOf(__2102419850_Ptr,marshalToNative(token)))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    public override fun MoveCurrentTo(item: IUnknown?): Boolean {
      val fnPtr = _2102419850_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2102419850_Ptr,marshalToNative(item),result))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val returnType = Boolean::class.createType()
      return marshalFromNative<Boolean>(result.getValue(), returnType!!)!!
    }

    public override fun MoveCurrentToPosition(index: Int): Boolean {
      val fnPtr = _2102419850_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2102419850_Ptr,marshalToNative(index),result))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val returnType = Boolean::class.createType()
      return marshalFromNative<Boolean>(result.getValue(), returnType!!)!!
    }

    public override fun MoveCurrentToFirst(): Boolean {
      val fnPtr = _2102419850_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2102419850_Ptr,result))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val returnType = Boolean::class.createType()
      return marshalFromNative<Boolean>(result.getValue(), returnType!!)!!
    }

    public override fun MoveCurrentToLast(): Boolean {
      val fnPtr = _2102419850_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2102419850_Ptr,result))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val returnType = Boolean::class.createType()
      return marshalFromNative<Boolean>(result.getValue(), returnType!!)!!
    }

    public override fun MoveCurrentToNext(): Boolean {
      val fnPtr = _2102419850_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2102419850_Ptr,result))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val returnType = Boolean::class.createType()
      return marshalFromNative<Boolean>(result.getValue(), returnType!!)!!
    }

    public override fun MoveCurrentToPrevious(): Boolean {
      val fnPtr = _2102419850_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2102419850_Ptr,result))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val returnType = Boolean::class.createType()
      return marshalFromNative<Boolean>(result.getValue(), returnType!!)!!
    }

    public override fun LoadMoreItemsAsync(count: WinDef.UINT):
        IAsyncOperation<LoadMoreItemsResult?>? {
      val fnPtr = _2102419850_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr)
      val result = makeByReferenceType<IAsyncOperation<LoadMoreItemsResult?>>(
      IAsyncOperation::class.createType(listOf(
        KTypeProjection(INVARIANT,LoadMoreItemsResult.ByValue::class.createType()),
      )))
      val hr = fn.invokeHR(arrayOf(__2102419850_Ptr,marshalToNative(count),result))
      if( hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val returnType = IAsyncOperation::class.createType(listOf(
        KTypeProjection(INVARIANT,LoadMoreItemsResult.ByValue::class.createType()),
      ))
      return marshalFromNative<IAsyncOperation<LoadMoreItemsResult?>>(result.getValue(),
          returnType!!)
    }
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICollectionView> {
    public override fun getValue(): ICollectionView = ABI.makeICollectionView(pointer.getPointer(0))

    public fun setValue(value: ICollectionView): Unit {
      pointer = value.__2102419850_Ptr!!
    }
  }

  public class ICollectionViewImpl(
    ptr: JNAPointer? = NULL
  ) : PointerType(ptr), WithDefault {
    public override val __2102419850_Ptr: JNAPointer?
      get() = pointer

    public override val _2102419850_VtblPtr: JNAPointer?
      get() = pointer.getPointer(0)

    public override val __1493305514_Ptr: JNAPointer? by lazy { 
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(guidOf<IObservableVector<IUnknown?>>())
      val result = PointerByReference()
      IUnknownVtbl(_2102419850_VtblPtr).queryInterface(pointer, refiid, result)
      result.value
    }


    public override val __1070388601_Ptr: JNAPointer? by lazy { 
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(guidOf<IVector<IUnknown?>>())
      val result = PointerByReference()
      IUnknownVtbl(_2102419850_VtblPtr).queryInterface(pointer, refiid, result)
      result.value
    }


    public override val __1449643190_Ptr: JNAPointer? by lazy { 
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(guidOf<IIterable<IUnknown?>>())
      val result = PointerByReference()
      IUnknownVtbl(_2102419850_VtblPtr).queryInterface(pointer, refiid, result)
      result.value
    }


    public companion object {
      public operator fun invoke(ptr: JNAPointer?): ICollectionView = ICollectionViewImpl(ptr)
    }
  }

  public object ABI : IABI<ICollectionView, MemoryAddress> {
    public override val layout: ValueLayout = ADDRESS

    public fun makeICollectionView(ptr: JNAPointer?) = ICollectionViewImpl( ptr)

    public override fun fromNative(segment: MemoryAddress): ICollectionView {
      val address = segment.toRawLongValue()
      return makeICollectionView(Pointer(address))
    }

    public override fun toNative(obj: ICollectionView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2102419850_Ptr))
  }
}

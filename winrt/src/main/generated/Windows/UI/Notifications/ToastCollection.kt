package Windows.UI.Notifications

import Windows.Foundation.Uri
import Windows.UI.Notifications.IToastCollectionFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ToastCollection.ABI::class)
@Signature("rc(Windows.UI.Notifications.ToastCollection;{0a8bc3b0-e0be-4858-bc2a-89dfe0b32863})")
@WinRTByReference(brClass = ToastCollection.ByReference::class)
public class ToastCollection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IToastCollection.WithDefault, IWinRTObject {
  private val __1044437429_Interface: IToastCollection.WithDefault by lazy {
    as_1044437429()
  }


  public override val __1044437429_Ptr: JNAPointer? by lazy {
    __1044437429_Interface.__1044437429_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1044437429_Interface)

  public constructor(
    collectionId: String,
    displayName: String,
    launchArgs: String,
    iconUri: Uri
  ) : this(ABI.activate(collectionId, displayName, launchArgs, iconUri))

  private fun as_1044437429(): IToastCollection.WithDefault {
    if(pointer == NULL) {
      return(IToastCollection.ABI.makeIToastCollection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IToastCollection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToastCollection.ABI.makeIToastCollection(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ToastCollection> {
    public override fun getValue() = ToastCollection(pointer.getPointer(0))

    public fun setValue(value: ToastCollection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ToastCollection, MemoryAddress> {
    public val IToastCollectionFactory_Instance: IToastCollectionFactory by lazy {
      createIToastCollectionFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIToastCollectionFactory(): IToastCollectionFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Notifications.ToastCollection".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IToastCollectionFactory.ABI.makeIToastCollectionFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      collectionId: String,
      displayName: String,
      launchArgs: String,
      iconUri: Uri
    ): JNAPointer? = IToastCollectionFactory_Instance.CreateInstance(collectionId, displayName,
        launchArgs, iconUri)?.pointer

    public override fun fromNative(segment: MemoryAddress): ToastCollection {
      val address = segment.toRawLongValue()
      return ToastCollection(Pointer(address))
    }

    public override fun toNative(obj: ToastCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}

package Windows.Foundation

import Windows.Foundation.IUriRuntimeClassFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

@ABIMarker(Uri.ABI::class)
@Signature("rc(Windows.Foundation.Uri;{9e365e57-48b2-4160-956f-c7385120bbfc})")
@WinRTByReference(brClass = Uri.ByReference::class)
public class Uri(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUriRuntimeClass.WithDefault,
    IUriRuntimeClassWithAbsoluteCanonicalUri.WithDefault, IStringable.WithDefault, IWinRTObject {
  private val __2147049023_Interface: IUriRuntimeClass.WithDefault by lazy {
    as_2147049023()
  }


  private val __1358589002_Interface: IUriRuntimeClassWithAbsoluteCanonicalUri.WithDefault by lazy {
    as_1358589002()
  }


  private val __328683030_Interface: IStringable.WithDefault by lazy {
    as_328683030()
  }


  public override val __2147049023_Ptr: JNAPointer? by lazy {
    __2147049023_Interface.__2147049023_Ptr
  }


  public override val __1358589002_Ptr: JNAPointer? by lazy {
    __1358589002_Interface.__1358589002_Ptr
  }


  public override val __328683030_Ptr: JNAPointer? by lazy {
    __328683030_Interface.__328683030_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2147049023_Interface, __1358589002_Interface, __328683030_Interface)

  public constructor(uri: String) : this(ABI.activate(uri))

  public constructor(baseUri: String, relativeUri: String) : this(ABI.activate(baseUri,
      relativeUri))

  private fun as_2147049023(): IUriRuntimeClass.WithDefault {
    if(pointer == NULL) {
      return(IUriRuntimeClass.ABI.makeIUriRuntimeClass(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUriRuntimeClass>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUriRuntimeClass.ABI.makeIUriRuntimeClass(ref.value))
  }

  private fun as_1358589002(): IUriRuntimeClassWithAbsoluteCanonicalUri.WithDefault {
    if(pointer == NULL) {
      return(IUriRuntimeClassWithAbsoluteCanonicalUri.ABI.makeIUriRuntimeClassWithAbsoluteCanonicalUri(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUriRuntimeClassWithAbsoluteCanonicalUri>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUriRuntimeClassWithAbsoluteCanonicalUri.ABI.makeIUriRuntimeClassWithAbsoluteCanonicalUri(ref.value))
  }

  private fun as_328683030(): IStringable.WithDefault {
    if(pointer == NULL) {
      return(IStringable.ABI.makeIStringable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStringable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStringable.ABI.makeIStringable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Uri> {
    public override fun getValue() = Uri(pointer.getPointer(0))

    public fun setValue(value: Uri): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Uri, MemoryAddress> {
    public val IUriEscapeStatics_Instance: IUriEscapeStatics by lazy {
      createIUriEscapeStatics()
    }


    public val IUriRuntimeClassFactory_Instance: IUriRuntimeClassFactory by lazy {
      createIUriRuntimeClassFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIUriEscapeStatics(): IUriEscapeStatics {
      val refiid = Guid.REFIID(IUriEscapeStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Foundation.Uri".toHandle(),refiid,interfacePtr)
      val result = IUriEscapeStatics.ABI.makeIUriEscapeStatics(interfacePtr.value)
      return result
    }

    public fun createIUriRuntimeClassFactory(): IUriRuntimeClassFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Foundation.Uri".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IUriRuntimeClassFactory.ABI.makeIUriRuntimeClassFactory(factoryActivatorPtr.value))
    }

    public fun activate(uri: String): JNAPointer? =
        IUriRuntimeClassFactory_Instance.CreateUri(uri)?.pointer

    public fun activate(baseUri: String, relativeUri: String): JNAPointer? =
        IUriRuntimeClassFactory_Instance.CreateWithRelativeUri(baseUri, relativeUri)?.pointer

    public override fun fromNative(segment: MemoryAddress): Uri {
      val address = segment.toRawLongValue()
      return Uri(Pointer(address))
    }

    public override fun toNative(obj: Uri): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun UnescapeComponent(toUnescape: String) =
        ABI.IUriEscapeStatics_Instance.UnescapeComponent(toUnescape)

    public fun EscapeComponent(toEscape: String) =
        ABI.IUriEscapeStatics_Instance.EscapeComponent(toEscape)
  }
}
